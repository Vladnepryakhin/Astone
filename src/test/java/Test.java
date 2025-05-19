package test.java;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test {


    @org.junit.jupiter.api.Test
    public void someTest() {
        given()
                .baseUri("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .params("foo1", "bar1")
                .params("foo2", "bar2")
                .when()
                .get()
                .then()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }
    @org.junit.jupiter.api.Test
    public void testPostRequest() {
        String requestBody = "{\"name\":\"John\", \"age\":30}";

        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("https://postman-echo.com/post")
                .then()
                .statusCode(200)
                .log().all();
    }
    @org.junit.jupiter.api.Test
    public void testPostData(){
        given()
        .baseUri("https://postman-echo.com/post")
                .params("foo1", "bar1")
                .params("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .log().all();
    }
    @org.junit.jupiter.api.Test
    public void testPut() {
        String requestBody = "{\"name\":\"Updated John\", \"age\":35}";

        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put("https://postman-echo.com/put")
                .then()
                .statusCode(200)
                .log().all();
    }
    @org.junit.jupiter.api.Test
    public void testPatch() {
        String requestBody = "{\"age\":40}";
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .patch("https://postman-echo.com/patch")
                .then()
                .statusCode(200)
                .log().all();
    }
    @org.junit.jupiter.api.Test
    public void testDelete() {
        RestAssured.given()
                .when()
                .delete("https://postman-echo.com/delete")
                .then()
                .statusCode(200)
                .log().all();
    }
}
