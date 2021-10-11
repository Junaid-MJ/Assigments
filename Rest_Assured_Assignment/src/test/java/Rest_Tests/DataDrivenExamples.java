package Rest_Tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDrivenExamples {
	
	@DataProvider(name="dataForPost")
	public Object [] [] dataForPost() {
		
		Object [] [] data = new Object[2][3];
		data[0][0]="Albert";
		data[0][1]="Einstien";
		data[0][2]="02";
		
		data[1][0]="Albert";
		data[1][1]="Einstien";
		data[1][2]="02";
		
		return data;
	}

	@Test(dataProvider = "dataForPost")
	public void POST_Test(String firstName, String secondName, int subjectId) {
		JSONObject request = new JSONObject();
		request.put("firstName",firstName);
		request.put("lastName",secondName);
		request.put("subjectId",subjectId);
		System.out.println(request);
		
		given().
		 header("Content-Type","application/json").
		 contentType(ContentType.JSON).
		 accept(ContentType.JSON).
		 body(request.toJSONString()).
		when().
		 post("https://reqres.in/api/users/2").
		then().
		  statusCode(200).
		  log().all();





	}

}
