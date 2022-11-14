package stepDefinition;

import cucumber.api.java.en.Given;
import io.cucumber.messages.internal.com.google.common.net.HttpHeaders;


import java.net.URL;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Stepdef {



	public URL url;
	public String queryParam1;
	public String queryParam2;


	@Given("^I Set POST student service api endpoint$")
	public void setPostEndpoint() {
		addURI = "http://localhost:9080/";
		System.out.println("Add URL :"+addURI);
		}

	@When ("^Send a POST HTTP request$")
	public void sendPostRequest(){
		doublename_id = Math.random();
		student_name = "MikeWong_"+id;//Just to avoid Duplicate Name entry
		String jsonBody="{\"name\":\""+firstName+"\":\"+lastName+\",\"id\":\"223445\",\"class\":\"3 A\",\"nationality\":\"Singapore\"}";
		System.out.println("\n\n" + jsonBody);
		HttpEntity<String>entity = new HttpEntity<String>(jsonBody, headers);
		//POST Method to Add New Student
		restTemplate = newRestTemplate ();
		response = restTemplate.postForEntity(addURI, entity, String.class);
	}

	@Then ("^I receive valid Response$")
	Public void verifyPostResponse(){
		responseBodyPOST = response.getBody();
		// Write response to file
		responseBody = response.getBody().toString();
		System.out.println("responseBody --->" + responseBody);
		// Get ID from the Response object
		studentId = getStudentIdFromResponse(responseBody);
		System.out.println("StudentId is :" + id);
		// Check if the added Student is present in the response body.
		Assert.hasText(responseBody,id);

		// Check if the status code is 201
		Assert.isTrue(response.getStatusCode()==HttpStatus.OK);
		System.out.println("Student is Added successfully employeeId:"+id);
	}



}
