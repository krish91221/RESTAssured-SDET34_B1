package CRUDOperationsWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectTest {

	@Test
	public void updateProjectTest()
	{
		baseURI = "http://localhost";
		port=8084;
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","Deepa" );
		jobj.put("project", "BOSCH");
		jobj.put("status", "Created");
		jobj.put("teamSize",100);
		
		given()
			.body(jobj)
			.contentType(ContentType.JSON)
		.when()
			.put("/projects/TY_PROJ_1002")
		.then()
			.assertThat().statusCode(200)
			.log().all();
	}
}
