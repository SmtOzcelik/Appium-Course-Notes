package delete_requests;

import base_url.DummyRestApiBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.DummyRestapiDeletePojo;
import utils.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Delete02 extends DummyRestApiBaseUrl {
    /*
     URL: https://dummy.restapiexample.com/api/v1/delete/2
     HTTP Request Method: DELETE Request
     Test Case: Type by using Gherkin Language
     Assert:     i) Status code is 200
                 ii) "status" is "success"
                 iii) "data" is "2"
                 iv) "message" is "Successfully! Record has been deleted"

     Given
        URL: https://dummy.restapiexample.com/api/v1/delete/2
     When
        HTTP Request Method: DELETE Request
        Test Case: Type by using Gherkin Language
     Then
        i) Status code is 200
     And
        ii) "status" is "success"
     And
        iii) "data" is "2"
     And
        iv) "message" is "Successfully! Record has been deleted"
       */
    @Test
    public void delete02(){
        //Set the url
        spec.pathParams("1","delete","2",2);
        //Set the expected data
        DummyRestapiDeletePojo expectedData=new DummyRestapiDeletePojo("success","2","Successfully! Record has been deleted");
        System.out.println("expectedData = " + expectedData);
        //Send the request and get the response
        Response response=given().spec(spec).when().delete("/{1}/{2}");
        response.prettyPrint();
        //Do assertion
        DummyRestapiDeletePojo actualData=ObjectMapperUtils.convertJsonToJava(response.asString(),DummyRestapiDeletePojo.class);
        System.out.println("actualData = " + actualData);
        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getData(),actualData.getData());
        assertEquals(expectedData.getStatus(),actualData.getStatus());

    }

}