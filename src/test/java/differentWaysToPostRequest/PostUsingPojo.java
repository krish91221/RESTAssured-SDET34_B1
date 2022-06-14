package differentWaysToPostRequest;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClasses.ProjectLibrary;

@Test
public class PostUsingPojo {
public void postUsingPojo()
  {
	baseURI="http://localhost";
	port=8084;
	Random ran=new Random();
	int random=ran.nextInt();
	ProjectLibrary pLib=new ProjectLibrary("Bhaskar","Tesla"+random,"Created",27);
	
	given()
	 .body(pLib)
	 .contentType(ContentType.JSON)
	.when()
	 .post("/addProject")
	.then()
	 .assertThat().statusCode(201)
	 .log().all();
  }
}
