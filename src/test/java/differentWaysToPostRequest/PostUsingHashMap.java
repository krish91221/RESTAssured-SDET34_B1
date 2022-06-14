package differentWaysToPostRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

public class PostUsingHashMap {
@Test
public void postUsingHashMap()
{
	baseURI="http://localhost";
	port=8084;
	
	
	Random ran=new Random();
	int random=ran.nextInt();
	
	HashMap hmap=new HashMap();
	hmap.put("createdBy","Bhanu");
	hmap.put("projectName","Flinko"+random);
	hmap.put("status","Created");
	hmap.put("teamSize", 29);
	
	given()
	 .body(hmap)
	 .contentType(ContentType.JSON)
	.when()
	 .post("/addProject")
	.then()
	 .assertThat().statusCode(201)
	 .log().all();
  }
}
