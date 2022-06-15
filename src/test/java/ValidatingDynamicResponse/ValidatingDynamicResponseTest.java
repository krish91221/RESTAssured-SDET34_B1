package ValidatingDynamicResponse;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.fail;

import java.util.List;

public class ValidatingDynamicResponseTest {
@Test
public void validatingDynamicResponse()
{
	baseURI="http://localhost";
	port=8084;
	String expData="TY_PROJ_1008";
	
	Response resp = when()
	 .get("/projects");
	 List<String> list = resp.jsonPath().get("projectId");
	 boolean flag=false;
	 for (String actData : list) {
		
		if(expData.equals(actData))
		{
			 Assert.assertEquals(expData, actData);
			 flag=true;
			 break;
		}
	}
	 if(flag)
	 {
		 resp.then().log().all();
	 }
	 else
	 {
		 Assert.fail();
	 }
}
}
