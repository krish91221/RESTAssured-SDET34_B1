package CRUDOperationsWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectTest {
	@Test
	public void createProjectTest()
	{
		baseURI = "http://localhost";
		port=8084;
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","Krish91221");
		jobj.put("projectName","Kenora");
		jobj.put("status", "On Going");
		jobj.put("teamSize", 18);

		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
}
