package CRUDOperationsWithoutUsingBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	@Test
	public void createProjectTest()
	{
		//Step 1 : Create pre conditions
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy","Krish91221");
		jObj.put("projectName","Bazingaa");
		jObj.put("status","Created");
		jObj.put("teamSize", 18);
		RequestSpecification req = RestAssured.given();
		req.body(jObj);
	//Step : 2 Execute Action/Request
		Response resp = req.post("http://localhost:8084/addProject");
	//Step 3: Validate Response
		System.out.println("=======================asString() output==================================");
		System.out.println(resp.asString());
		System.out.println("=======================asPrettyString() output==================================");
		System.out.println(resp.asPrettyString());
		System.out.println("=======================prettyPrint() output==================================");
		System.out.println(resp.prettyPrint());
		System.out.println("=======================prettyPeek() output==================================");
		System.out.println(resp.prettyPeek());
		System.out.println("=======================log().all() output in console and report==================================");
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}

}
