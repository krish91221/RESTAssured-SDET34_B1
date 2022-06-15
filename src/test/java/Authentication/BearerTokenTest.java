package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerTokenTest {
	@Test
	public void bearerTokenTest()
	{
		//base Uri https://api.github.com
		//end point /user/repos
		JSONObject jobj=new JSONObject();
		jobj.put("name", "SDET34Repo_created_with_RestAssured");
		baseURI="https://api.github.com";
		given()
		 .body(jobj)
		 .auth().oauth2("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")
		.when()
		 .post("/user/repos")
		.then()
		 .assertThat().statusCode(201)
		 .log().all();
	}
}
