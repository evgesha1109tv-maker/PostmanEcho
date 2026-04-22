import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class PostmanEchoTest {
    @Test
    void returnSeldData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("Hello, Postman Echo!")
                .when()
                .log().all()
                .post("/post")
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("Hello, Postman Echo!"));


    }
}
