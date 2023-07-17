Feature: Validate Google Place detils

@Addplace
Scenario Outline:: Validate user add new place with API
Given Add Place Payload with "<name>"  "<language>" "<address>"
	When user calls "AddPlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And verify place_Id created maps to "<name>" using "getPlaceAPI"
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_Id created maps to "<name>" using "getPlaceAPI"
	And verify place_Id created maps to "<name>" using "getPlaceAPI"
	
Examples:
   |name|language|address|
   |Manish|French|France|
   |Test|English|USA|
      |Test|English|USA|
