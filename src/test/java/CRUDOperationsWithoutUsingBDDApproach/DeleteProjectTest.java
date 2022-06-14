package CRUDOperationsWithoutUsingBDDApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjectTest {
	@Test
	public void deleteProjectTest()
	{
		//Step 1 : Preconditions
		//Step 2 : execute request
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_808");
		//Step 3: validate response
		resp.then().assertThat().statusCode(200);
	}
}
