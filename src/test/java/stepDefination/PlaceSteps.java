package stepDefination;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class PlaceSteps extends Utils {
	Response rep;
	TestDataBuild b = new TestDataBuild();
	RequestSpecification res;
	static String placeId;

	@Given("Add Place Payload with {string}  {string} {string}")
	public void add_place_payload_with(String name, String address, String language) throws IOException {
		res = given().spec(requestSpecification()).body(b.requestSpecification(name, address, language));
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
		if (method.equalsIgnoreCase("POST")) {
			APIResources resourceAPI = APIResources.valueOf(resource);
			rep = res.when().post(resourceAPI.getResource());
		} else if (method.equalsIgnoreCase("GET")) {
			APIResources resourceAPI = APIResources.valueOf(resource);
			rep = res.when().get(resourceAPI.getResource());
		}
	}

	@Then("the API call got success with status code 200")
	public void the_api_call_got_success_with_status_code() {
		int statusCode = rep.statusCode();
		Assert.assertEquals(200, statusCode);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value) {
		Assert.assertEquals(getJsonPath(rep, key), value);

	}

	@Then("verify place_Id created maps to {string} using {string}")
	public void verify_place_id_created_maps_to_using(String Expectedname, String resource) throws IOException {
		placeId = getJsonPath(rep, "place_id");
		res = given().spec(requestSpecification().queryParam("place_id", placeId));
		user_calls_with_http_request(resource, "GET");
		String nameValue = getJsonPath(rep, "name");
		assertEquals(nameValue, Expectedname);
	}

}
