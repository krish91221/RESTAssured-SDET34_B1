package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2Authentication {
	@Test
	public void oauth2Authentication() {
		// BaseUri - http://coop.apps.symfonycasts.com
		// end point - /token
		// Client ID ProKey
		// Client Secret f553fe101974cece938fb91b059d7188
		// Redirect URI https://krish.com
		// Step 1: Provide the details and get the access token
		baseURI = "http://coop.apps.symfonycasts.com";

		Response resp =given()
				.formParam("client_id", "ProKey")
				.formParam("client_secret", "f553fe101974cece938fb91b059d7188")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "https://krish.com")
				.formParam("code", "authorization_code")
				.when()
				.post("/token");

		//step 2: capture the response and store to a variable 
		String token=resp.jsonPath().get("access_token");
		System.out.println(token);
		//step 3: utilize the token and access the api 
		/*Retrieves user that's tied to the	access token /api/me 						GET 
		Unlock the Barn 								/api/USER_ID/barn-unlock 		POST 
		Put the Toilet Seat Down 						/api/USER_ID/toiletseat-down	POST 
		Feed Your Chickens 								/api/USER_ID/chickens-feed 		POST 
		Collect Eggs from Your Chickens 				/api/USER_ID/eggs-collect 		POST 
		Get the Number of Eggs Collected Today			 /api/USER_ID/eggs-count 		POST 
		Success Request*/
		String user= 
		given() 
				.auth() 
				.oauth2(token) 
				.when()
				.get("/api/me")
				.jsonPath()
				.get("id");
		System.out.println(user);
		System.out.println("Unlock the Barn  action");
		given() 
		.pathParam("USER_ID",user) 
		.auth() 
		.oauth2(token) 
		.when() 
		.post("/api/{USER_ID}/barn-unlock") 
		.then()
		.log().all();
		System.out.println("Put the Toilet Seat Down ");

		given()
		.pathParam("USER_ID", user) 
		.auth() 
		.oauth2(token) 
		.when()
		.post("/api/{USER_ID}/toiletseat-down") 
		.then() 
		.log().all();
		System.out.println("Feed Your Chickens  "); 
		given() 
		.pathParam("USER_ID",user) 
		.auth() 
		.oauth2(token) 
		.when() 
		.post("/api/{USER_ID}/chickens-feed ")
		.then() 
		.log().all();
		System.out.println("Collect Eggs from Your Chickens");
		given()
		.pathParam("USER_ID", user) 
		.auth() 
		.oauth2(token) 
		.when()
		.post("/api/{USER_ID}/eggs-collect ") 
		.then() 
		.log().all();
		System.out.println("Number of Eggs Collected Today	  ");
		given()
		.pathParam("USER_ID", user) 
		.auth()
		.oauth2(token)
		.when()
		.post("/api/{USER_ID}/eggs-count  ") 
		.then()
		.log().all();
	}

}
