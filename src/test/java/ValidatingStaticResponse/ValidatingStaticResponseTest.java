package ValidatingStaticResponse;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ValidatingStaticResponseTest {
@Test
public void validatingStaticResponseTest()
{
	baseURI="http://localhost";
	port=8084;
	String expData="TY_PROJ_1003";
	
	Response resp = when()
	 .get("/projects");
	String actData=resp.jsonPath().getString("[0].projectId");
	Assert.assertEquals(expData, actData);
	resp.then().log().all();
}
}
