package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.FeatureData;

import java.io.File;

public class DataFileReaderUtils {


    public static FeatureData getDataFile(String filePath){

        ObjectMapper mapper = new ObjectMapper();

        try{

            File file = new File("src/test/resources/data/"+filePath);
            return mapper.readValue(file, FeatureData.class);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
