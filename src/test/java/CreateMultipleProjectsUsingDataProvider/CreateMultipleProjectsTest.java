package CreateMultipleProjectsUsingDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClasses.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class CreateMultipleProjectsTest {
	@Test(dataProvider = "ProjectDetails")
	public void createMultipleProjectsTest(String createdBy ,String projectName, String status, int teamSize )
	{
		baseURI="http://localhost";
		port=8084;
		ProjectLibrary pLib=new ProjectLibrary(createdBy, projectName, status, teamSize);
		
		given()
		 .body(pLib)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .assertThat().statusCode(201)
		 .log().all();

	}

	@DataProvider(name="ProjectDetails")
	public Object[][] getProjectDetails()
	{
		Object[][] data=new Object[3][4];

		data[0][0]="Sharukhan";
		data[0][1]="TCS";
		data[0][2]="On Going";
		data[0][3]=16;

		data[1][0]="Jamuna";
		data[1][1]="KSS";
		data[1][2]="Created";
		data[1][3]=100;

		data[2][0]="Murali";
		data[2][1]="SkyRoot";
		data[2][2]="Created";
		data[2][3]=1000;

		return data;
	}
}
