package get_requests;

import base_url.JsonplaceholderBaseUrl;
import org.junit.Test;

public class Get14 extends JsonplaceholderBaseUrl {
     /*
         Given
            https://jsonplaceholder.typicode.com/todos/2
        When
            I send GET Request to the URL
        Then
            Status code is 200
            And "completed" is false
            And "userId" is 1
            And "title" is "quis ut nam facilis et officia qui"
            And header "Via" is "1.1 vegur"
            And header "Server" is "cloudflare"
            {
                "userId": 1,
                "id": 2,
                "title": "quis ut nam facilis et officia qui",
                "completed": false
            }
     */
    @Test
    public void get(){
        //1-Set the url
        spec.pathParams("first","todas","second",2);
        //2-Set the expected data

    }
}
