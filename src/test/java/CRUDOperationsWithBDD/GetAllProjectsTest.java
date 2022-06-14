package CRUDOperationsWithBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetAllProjectsTest {
	@Test
	public void getAllProjectsTest()
	{
		baseURI="http://localhost";
		port=8084;
		when()
			.get("/projects")
		.then()
			.assertThat().statusCode(200)
			.log().all();
			

	}
}
