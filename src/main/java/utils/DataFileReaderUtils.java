package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import model.DrinkCocktails;
import model.FeatureDataModel;
import model.Ingredients;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataFileReaderUtils {

    public static FeatureDataModel getDataFile(String filePath){

        //define Object mapper to read data from json
        ObjectMapper mapper = new ObjectMapper();

        try{
            //read file from provide location
            File file = new File("src/test/resources/data/"+filePath);
            return mapper.readValue(file, FeatureDataModel.class);

        }catch (IOException e){

            e.printStackTrace();

            return null;
        }

    }
    /*
        - defining a generic method to be used to deserialize json response into object parser
        - define a jackson Object mapper parser, to read json data
        - deserialize json body to Ingredients class
     */
    public static <T> T deserializeJsonResponse(Response jsonResponse, Class<T> objectType){

        try {

            ObjectMapper mapper = new ObjectMapper();
            //convert cocktailDB json response into java pojo class, using Object mapper
            return mapper.readValue(jsonResponse.getBody().asString(), objectType);

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