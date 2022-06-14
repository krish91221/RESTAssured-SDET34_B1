package CRUDOperationsWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetSingleProjectTest {
@Test
public void getSingleProjectTest()
{
	when()
		.get("/projects/TY_PROJ_1002")
	.then()
		.assertThat().statusCode(200)
		.log().all();
}
}
