package ValidatingResponseTime;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClasses.ProjectLibrary;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class ValidateResponseTimeTest {
	
	@Test
	public void validateResponseTimeTest()
	{	
		baseURI="http://localhost";
		port=8084;
		ProjectLibrary pLib=new ProjectLibrary("Krish", "BharathBenz"+new Random().nextInt(1000), "On Going", 100);

		Response resp = given()
				.body(pLib)
				.contentType(ContentType.JSON)
				.when()
				.post("/addProject");

		long rtime = resp.getTime();
		Assert.assertEquals(4, rtime);
		resp.then()
		.log().all();
	}
	@Test
	public void validateResponseTimeUsingHamcrestTest()
	{	
		baseURI="http://localhost";
		port=8084;
		ProjectLibrary pLib=new ProjectLibrary("Krish", "BharathBenz"+new Random().nextInt(1000), "On Going", 100);

		given()
		.body(pLib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().time(Matchers.lessThan(1500L))
		.log().all();
	}

}
