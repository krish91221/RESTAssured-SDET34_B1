package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameter {
	@Test
	public void queryParameter()
	{
		baseURI="http://localhost";
		port=8084;
		given()
		.queryParam("designation", "admin")
		.when()
		.get("/employees")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
