package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEcho {
    @Test
    void shouldReturnData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("dattebayo")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("data"));
    }
}
