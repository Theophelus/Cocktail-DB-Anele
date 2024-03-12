package utils;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestUtils {
    //create a request using specBuilder
    public static RequestSpecification getRequestSpecifications(String baseUrl,
                                                                String basePath) {
        try {
            return new RequestSpecBuilder()
                    .setBaseUri(baseUrl)
                    .setBasePath(basePath)
                    .build();
        } catch (Exception e) {
            System.out.println("Error occurred while trying to make a request to Cocktail DB:"
                    + e.getMessage());
            return null;
        }
    }

    /*
     get the response from request specBuilder and build the response
     then method can be used on api call to validate response body
     */
    public static Response getData(RequestSpecification requestSpec,
                                   PathBuilderUtils pathBuilder, Map<String, String> queryParams) {
        //get path value from enum
        String path = pathBuilder.getPath();
        try {
            if (!queryParams.isEmpty()) {
                requestSpec.queryParams(queryParams)
                        .header("Content-Type", "application/json");
            }

            return given()
                    .spec(requestSpec)
                    //adding allure report filters
                    .filter(new AllureRestAssured())
                    .when()
                    .get(path);

        } catch (Exception e) {
            System.out.println("Error occurred while trying to get data from Cocktail DB: " + e.getMessage());
            return null;
        }
    }
}
