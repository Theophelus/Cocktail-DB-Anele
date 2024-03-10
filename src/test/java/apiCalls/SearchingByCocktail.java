package apiCalls;

import base.BaseTest;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.RestUtils;

import java.util.Map;
import java.util.Objects;

import static utils.PathBuilderUtils.SEARCH;
import static utils.RestUtils.getData;

public class SearchingByCocktail extends BaseTest {

    static String baseUrl = dataFromJsonDataFile.getCocktailDbEndpoint();
    static String basePath = dataFromJsonDataFile.getCocktailDbBasePath();

    public static Response getCocktailResponse(Map<String, String> queryParams) {
        //Build the request
        RequestSpecification httpRequest = RestUtils.getRequestSpecifications(baseUrl, basePath);

        if (httpRequest == null){
            throw new  RuntimeException("HTTP Specification is null");
        }
        return Objects.requireNonNull(getData(httpRequest, SEARCH, queryParams));
    }
    /*
        Add a method to

     */
}
