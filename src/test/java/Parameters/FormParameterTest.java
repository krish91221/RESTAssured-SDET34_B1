package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FormParameterTest {
	@Test
	public void  formParameterTest() {
		baseURI="http://localhost";
		port=8084;
		given()
		 .formParam("createdBy", "Krish")
		 .formParam("projectName","Zeus")
		 .formParam("status", "Created")
		 .formParam("teamSize", 18)
		.when()
		 .post("/addProject")
		.then()
		 .assertThat().statusCode(201)
		 .log().all();
	}
}
