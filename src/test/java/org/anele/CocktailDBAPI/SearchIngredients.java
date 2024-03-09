package org.anele.CocktailDBAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SearchIngredients {

    @Test
    public void userShouldBeAbleToSearchIngredientsUsingIngredientsName() {

        RestAssured.baseURI = "http://www.thecocktaildb.com/";
        RestAssured.basePath = "api/json/v1/1/search.php/";
        Map<String, String> ingredientsParams = new HashMap<>();
        ingredientsParams.put("i", "vodka");

        Response response = RestAssured.given().
                header("Content-Type", "application.json").contentType(ContentType.JSON).
                params(ingredientsParams).
                get().
                then().
                log().
                all().
                extract().
                response();

        Assert.assertEquals(response.statusCode(), 200);

    }
}
