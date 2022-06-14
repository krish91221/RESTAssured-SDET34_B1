package CRUDOperationsWithoutUsingBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
@Test
public void updateProjectTest()
{
	// Step 1: create pre conditions
	JSONObject jObj=new JSONObject();
	jObj.put("createdBy", "Murali Krishna");
	jObj.put("projectName", "AgniPath");
	jObj.put("status", "Created");
	jObj.put("teamSize",20000);
	RequestSpecification req = RestAssured.given();
	//Step 2 : execute request
	req.body(jObj);
	req.contentType(ContentType.JSON);
	Response resp = req.put("http://lovalhost:8084/projects/TY_PROJ_808");
	
	//Step 3 : Validate response
	resp.then().log().all();
}
}
