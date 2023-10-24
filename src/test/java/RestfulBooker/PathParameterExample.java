package RestfulBooker;

import io.restassured.RestAssured;

public class PathParameterExample {
    public static void main(String[] args) {

        RestAssured
                .given()
                .log()
                .all()
                /*.baseUri("https://restful-booker.herokuapp.com/")
                .basePath("{basepath}/{bookingId}")
                .pathParam("basepath", "booking")
                .pathParam("bookingId", 2)*/

                //Another way to send the path params
                .when()
                .get("https://restful-booker.herokuapp.com/{basepath}/{bookingid}", "booking", 3)
                .then()
                .log()
                .all();
    }
}
