package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteBooking {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/")
               // .basePath("booking/2")
                .basePath("booking/{bookingID}")
                .pathParam("bookingID", "5")
                .header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .contentType(ContentType.JSON)
                .log()
                .all()
                .when()
                .delete()
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(201);
    }
}
