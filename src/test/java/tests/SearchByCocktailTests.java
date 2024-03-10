package tests;

import apiCalls.SearchingByCocktail;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static utils.DataFileReaderUtils.readJsonSchema;

public class SearchByCocktailTests {

    @Test(description = "verify cocktail DB response contains cocktailJsonSchema properties")
    public void validateCocktailJsonResponseAgainstJsonsSchema() throws IOException {

        Map<String, String> margarita = new HashMap<>();
        margarita.put("s", "Margarita");
        String cocktailJsonSchema = "cocktailJsonSchema.json";
        Response httpResponse = SearchingByCocktail.getCocktailResponse(margarita);
        // Validate response against JSON schema
        httpResponse
                .then()
                .assertThat()
                .statusCode(200)
                .body(JsonSchemaValidator
                .matchesJsonSchema(readJsonSchema(cocktailJsonSchema)));

    }

}
