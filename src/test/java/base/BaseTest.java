package base;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import model.FeatureDataModel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.DataFileReaderUtils;

public class BaseTest {
    //define Feature Data object
    private static FeatureDataModel dataFromJsonDataFile;

    static
    {
//        System.out.println("data file name:" +dataFromJsonDataFile.getCocktailDbBasePath());
        dataFromJsonDataFile = DataFileReaderUtils.getDataFile("data.json");
    }

    @BeforeClass
    public void setup(){
        //filter for Allure reports
        RestAssured.filters(new RequestLoggingFilter(),
                new ResponseLoggingFilter(),
                new AllureRestAssured());
    }


    public static FeatureDataModel readJsonFile() {
        return dataFromJsonDataFile;
    }
}
