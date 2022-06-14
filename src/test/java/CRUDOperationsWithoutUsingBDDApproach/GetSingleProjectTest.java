package CRUDOperationsWithoutUsingBDDApproach;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetSingleProjectTest {
	@Test
	public void getSingleProjectTest()
	{
		//Step 1: Create Preconditions
		
		//Step 2 : Execute Action
		Response resp = RestAssured.get("http://lovalhost:8084/projects/TY_PROJ_808");
		//Step 3 : validate response
		resp.then().log().all();
		int code=resp.getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println(resp.getHeader("statisCode"));
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getBody());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getSessionId());	
	}

}
