package Rest_Tests;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Tests_POST {
	
	
	@Test
	public void POST_Test() {
//		Map<String,Object> map= new HashMap<String, Object>();
//		map.put("name", "Junaid");
//		map.put("job", "student");
//		System.out.println(map);
		
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
	
	
	//@Test
	public void PUT_Test() {

		
		JSONObject request = new JSONObject();
		request.put("name","Junaid");
		request.put("job","System Engineer");
		System.out.println(request);
		
		given().
		 header("Content-Type","application/json").
		 contentType(ContentType.JSON).
		 accept(ContentType.JSON).
		 body(request.toJSONString()).
		when().
		 put("https://reqres.in/api/users/2").
		then().
		  statusCode(200).
		  log().all();
		
		
	}
	
	//@Test
	public void PATCH_Test() {

		
		JSONObject request = new JSONObject();
		request.put("name","Junaid");
		request.put("job","System Engineer");
		System.out.println(request);
		
		given().
		 header("Content-Type","application/json").
		 contentType(ContentType.JSON).
		 accept(ContentType.JSON).
		 body(request.toJSONString()).
		when().
		 patch("https://reqres.in/api/users/2").
		then().
		  statusCode(200).
		  log().all();
		
		
	}
	
	//@Test
	public void DELETE_Test() {

        when().
		 delete("https://reqres.in/api/users/2").
		then().
		  statusCode(204).
		  log().all();
		
		
	}

}
