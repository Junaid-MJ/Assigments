package Rest_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Test01_GET {
	
	
	@Test
	void Test_01() {
		 Response response= get("https://reqres.in/api/users?page=2");
		 System.out.println(response.asString());
		 System.out.println(response.getBody().asString());
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getHeader("content-type"));
		 System.out.println(response.getTime());
		 
		 int code = response.getStatusCode();
		 Assert.assertEquals(code, 200 );
		 
	}
	
	@Test
	void Test_02() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}

}
