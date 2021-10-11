package Assignments;

import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

public class Assgn_2 {
	
	@Test
	void Test_01() {
		 
		 given().
		 when().
		  get("https://reqres.in/api/users?page=2").
		 then().
		  log().all();
 	 
	}

}
