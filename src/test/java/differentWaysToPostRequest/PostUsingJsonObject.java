package differentWaysToPostRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class PostUsingJsonObject {
	@Test
	public void postJsonObj()
	{
		baseURI="http://localhost";
		port=8084;
		Random ran=new Random();
		int random=ran.nextInt();
		
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Bhanu");
		jObj.put("projectName","Flinko"+random);
		jObj.put("status","Created");
		jObj.put("teamSize", 29);
		
		given()
		 .body(jObj)
		 .contentType(ContentType.JSON)
		.when()
		 .post("./addProject")
		.then()
		 .assertThat().statusCode(201)
		 .log().all();
	}
}
