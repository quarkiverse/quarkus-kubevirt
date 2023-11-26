package io.quarkiverse.quarkus.kubevirt.client.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class KubevirtClientResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/kubevirt-client")
                .then()
                .statusCode(200)
                .body(is("Hello kubevirt-client"));
    }
}
