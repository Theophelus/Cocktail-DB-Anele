package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import model.DrinkCocktails;
import model.FeatureDataModel;
import model.Ingredients;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataFileReaderUtils {


    public static FeatureDataModel getDataFile(String filePath){
        ObjectMapper mapper = new ObjectMapper();

        try{

            File file = new File("src/test/resources/data/"+filePath);
            return mapper.readValue(file, FeatureDataModel.class);

        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    /*
        - deserializeJsonResponse call take a jsonResponse params
        - define a jackson Object mapper object, to read json data
        - deserialize json body to Ingredients class
     */
    public static Ingredients deserializeJsonResponse(Response jsonResponse){
        try {

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonResponse.getBody().asString(), Ingredients.class);
        }catch (Exception e){
            e.printStackTrace();

            return null;
        }
    }

    /*
        - cocktailDeserializeJsonResponse call take a jsonResponse params
        - define a jackson Object mapper object, to read json data
        - deserialize json body to Ingredients class
     */
    public static DrinkCocktails cockDeserializeJsonResponse(Response jsonResponse){
        try {

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonResponse.getBody().asString(), DrinkCocktails.class);
        }catch (Exception e){
            e.printStackTrace();

            return null;
        }
    }

    /*
        add a method to read json schema for validating with json response
     */
    public static String readJsonSchema(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get("src/test/resources/data/", filePath)));
    }
}