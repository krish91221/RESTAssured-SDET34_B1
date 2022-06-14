package differentWaysToPostRequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.Random;

@Test
public class PostUsingJsonFile {
public void postUsingJsonFile()
{
	baseURI="http://localhost";
	port=8084;
	Random ran=new Random();
	int random=ran.nextInt();
	File fLib=new File(".\\requestData.json");
	
	given()
	 .body(fLib)
	 .contentType(ContentType.JSON)
	.when()
	 .post("/addProject")
	.then()
	 .assertThat().statusCode(201)
	 .log().all();
}
}
