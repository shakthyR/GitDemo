package stepDefinitions;

import java.io.IOException;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	
	public void  beforeSenario() throws IOException
	{
		stepDefinition m = new stepDefinition();
		if (stepDefinition.place_id == null)
		{
		m.add_place_payload_with("Kumaragom", "Malayalam", "Kerala");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_id_created_maps_to_using("Kumaragom", "getPlaceAPI"); 
		}
		
	}
}
