package api;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BookStoreApiTest {

    @Test
    public void validarListaDeLivros() {
        RestAssured.baseURI = "https://demoqa.com";

        given()
        .when()
            .get("/BookStore/v1/Books")
        .then()
            .statusCode(200)
            .body("books.size()", greaterThan(0));
    }
}