package org.example.filter.inheritance;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


@QuarkusTest
class ExampleResourceTest {

    @Test
    void testFather() {
        given().when().get("/test/father")
                .then().statusCode(200);
    }

    @Test
    void testSon() {
        given().when().get("/test/son")
                .then().statusCode(200);
    }
}
