package Rest_Tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Tests_GET {
	
	@Test
	public void Test_01() {
		
		given().
		 get("https://reqres.in/api/users?page=2").
		then().
		body("data.id[1]", equalTo(8))
		.body("data.first_name", hasItems("Michael","Lindsay"));
		 
		
		
		
	}

}
