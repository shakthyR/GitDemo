Feature: Validating Place API's
@AddPlace @Regression
Scenario Outline: Verify if Place is being Successfully added using AddPlaceAPI
	Given Add Place Payload with "<name>" "<language>" "<address>" 
	When user calls "AddPlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And  verify place_id created maps to "<name>" using "getPlaceAPI"
	
Examples:
	
	|name            | language          | address          |  
	|MyHouse         | Russian           | Putin Street     |
#	|ParentHouse     | Mandarin          | Shangai          |
#	|BroHouse        | English           | Melbourne        |	

@DeletePlace @Regression

Scenario: Verify if Delete Place funcionality is working
	Given Deleteplace Payload
	When user calls "deletePlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	 
