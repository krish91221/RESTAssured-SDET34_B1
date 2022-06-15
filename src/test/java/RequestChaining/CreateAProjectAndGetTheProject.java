package RequestChaining;

import org.testng.annotations.Test;

import GenericLibraries.JavaLibraries;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClasses.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class CreateAProjectAndGetTheProject {
	@Test
	public void crateAProjectAndGetTheSameProjectTest()
	{
		baseURI="http://localhost";
		port=8084;
		//Step1: create a project 
		ProjectLibrary pLib=new ProjectLibrary("Brinda", "Amdocs"+new JavaLibraries().getRandomNum(), "Created", 18);
		//step 2: capture the createdproject
		Response resp = given()
				.body(pLib)
				.contentType(ContentType.JSON)
			.when()
			    .post("/addProject");
		//step 3: store oit it ot a variable
		String ProjId=resp.jsonPath().getString("projectId");
		System.out.println(ProjId);
		//step 4: use the same variable in new request
		given()
		 .pathParam("pid", ProjId)
		.when()
		 .get("/projects/{pid}")
		.then()
		 .assertThat().statusCode(200)
		 .log().all();
		//Step 5: delete the same project
		when()
		  .delete("/projects/"+ProjId)
		 .then()
		  .assertThat().statusCode(204)
		  .log().all();			
	}

}
