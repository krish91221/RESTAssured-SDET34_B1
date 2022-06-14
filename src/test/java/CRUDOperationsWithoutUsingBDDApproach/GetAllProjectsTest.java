package CRUDOperationsWithoutUsingBDDApproach;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjectsTest {
@Test
public void getAllProjectsTest()
{
	//Step 1 : create preconditions not required for get operation
	//Step 2 :Execute Action/request
	Response resp = RestAssured.get("http://localhost:8084/projects");
	//Step 3 : validate response
	resp.then().log().all();
}
}
//TY_PROJ_808