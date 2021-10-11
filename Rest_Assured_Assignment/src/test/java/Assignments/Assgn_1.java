package Assignments;

import static io.restassured.RestAssured.*;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Assgn_1 {
	
	@Test
	public void Test01() {
		
		
		
		JSONObject request = new JSONObject();
		request.put("name","Junaid");
		request.put("job","System Engineer");
		System.out.println(request);
		
		given().
		 body(request.toJSONString()).
		when().
		 post("https://reqres.in/api/users").
		then().
		  statusCode(201);
		
	}
	

}
