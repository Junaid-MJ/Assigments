package StepDefinitions;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class Assignment1 {
	Response response;
	@Test
	@Given("API for foreign exchange")

	public void set_https_request() {
		String api = " http://api.exchangeratesapi.io/v1/latest?access_key=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";


	}
	@When("create negative scenario")
	@Test
	public void create_negative_scenario() {
		RestAssured.baseURI="http://api.exchangeratesapi.io/v1/latest?access_key=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";
		RequestSpecification httprequest = RestAssured.given();
		Response response =httprequest.request(Method.GET, "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");
		response= httprequest.get();

	}
	@Test
	@Then("print the response into console")
	public void print_the_response_into_console() {
		System.out.println("Response Body is:"+response);
		System.out.println("It gives Negative response");

	}




}