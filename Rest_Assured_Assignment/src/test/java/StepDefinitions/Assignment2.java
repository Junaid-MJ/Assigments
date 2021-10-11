package StepDefinitions;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.time.LocalDate;

public class Assignment2 {
	@Given("API for foreign exchange")
	public void step_http_request() {
		String api = "http://api.exchangeratesapi.io/v1/latest?access_key=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";
		
		
	}
@Test
	@When("To get Time & Date")
	public void to_get_time_date() {
	JSONObject request = new JSONObject();
	request.put("success", "true");
	request.put("base", "EUR");
	request.put("date", "2021-08-26");
	
	
	Response res =RestAssured.post("http://api.exchangeratesapi.io/v1/latest?access_key=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");
	
	System.out.println(res.getBody());
	
}



}