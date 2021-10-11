package Assignments;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Assgn_3 {
	
	@Test
	void Test_01() {
		 Response response= get("https://reqres.in/api/users?page=2");
		
		
		 int code = response.getStatusCode();
		 Assert.assertEquals(code, 200 );
		 
		 
		 given().
		 get("https://reqres.in/api/users?page=2").
		then().
		body("data.id[1]", equalTo(8))
		.body("data.first_name", hasItems("Michael","Lindsay"));
		 
	}

}
