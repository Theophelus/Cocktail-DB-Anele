package base;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import model.FeatureDataModel;
import org.testng.annotations.BeforeClass;
import utils.DataFileReaderUtils;

public class BaseTest {
    //define Feature Data object
    public static FeatureDataModel dataFromJsonDataFile;

    static
    {
        dataFromJsonDataFile = DataFileReaderUtils.getDataFile("data.json");
    }

    @BeforeClass
    public void setup(){
        RestAssured.filters(new AllureRestAssured());
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}
