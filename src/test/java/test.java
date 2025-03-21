import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;
import java.util.*;

public class test {
    @Test
    public void test() {

        JsonPath response = RestAssured
                .given()
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();

        List<Map<String, String>> messages = response.getList("messages");
            Map<String, String> mass = messages.get(1);

            String message = mass.get("message");
            System.out.println("Message: " + message);

            String timestamp = mass.get("timestamp");
            System.out.println("Timestamp: " + timestamp);

    }
}