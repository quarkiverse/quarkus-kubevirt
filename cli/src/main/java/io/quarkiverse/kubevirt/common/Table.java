package io.quarkiverse.kubevirt.common;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public class Table<T> {

    private List<String> headers;
    private List<Function<T, String>> mappers;
    private List<T> items;
    private int[] lengths;

    private int linesPrinted = 0;

    public Table(List<String> headers, List<Function<T, String>> mappers, List<T> items) {
        this.headers = headers;
        this.mappers = mappers;
        this.items = items;

        if (headers.size() != mappers.size()) {
            throw new IllegalArgumentException("Headers and mappers must have the same length");
        }
    }

    public void print() {
        System.out.println(String.format(getFormat(), headers.stream().map(String::toUpperCase).toArray()));
        linesPrinted++;
        for (int i = 0; i < items.size(); i++) {
            T item = items.get(i);
            System.out
                    .println(String.format(getFormat(),
                            mappers.stream().map(m -> m.apply(item)).map(s -> s != null ? s : "").toArray()));

            linesPrinted++;
        }
    }

    public void refresh() {
        System.out.printf("\033[%dA\033[0J", linesPrinted);
        linesPrinted = 0;
        print();
    }

    private String getFormat() {
        StringBuilder sb = new StringBuilder();
        int lengths[] = getLengths();
        for (int i = 0; i < lengths.length; i++) {
            sb.append(" %-" + lengths[i] + "s ");
            sb.append("\t");
        }
        return sb.toString();
    }

    private int[] getLengths() {
        int[] result = new int[headers.size()];
        for (int i = 0; i < headers.size(); i++) {

            int length = Stream.concat(Stream.of(headers.get(i)), items.stream().map(mappers.get(i)))
                    .filter(Objects::nonNull)
                    .map(String::length)
                    .max(Comparator.naturalOrder())
                    .orElse(0);

            result[i] = length;
        }
        return result;
    }
}
