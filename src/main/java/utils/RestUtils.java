package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestUtils {

    //create a request using specBuilder
    public static RequestSpecification getRequestSpecifications(String baseUrl,
                                                                String basePath){
        try {
            return new RequestSpecBuilder()
                    .setBaseUri(baseUrl)
                    .setBasePath(basePath)
                    .build();

        } catch (Exception e){
            System.out.println("Error occurred while trying to make a request to Cocktail DB:"
                    + e.getMessage());
            e.printStackTrace();

            return null;
        }
    }
}
