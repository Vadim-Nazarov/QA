import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class GetTest {

    @Test
    public void testRestAssured(){
        Response response = RestAssured
                .get( "https://playground.learnqa.ru/api/hello")
                .andReturn();
        response.prettyPrint();
    }
}