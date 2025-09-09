package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.location;

public class TestDataBuild {

	
	
	public AddPlace addPlacePayload(String name, String language, String address)
	{
		AddPlace p = new AddPlace();

		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setName(name);
		p.setWebsite("https://rahulshettyacademy.com");
		p.setPhone_number("(+91) 983 893 3937");

		List<String> myList = new ArrayList<String>();
		myList.add("shoepark");
		myList.add("shop");
		p.setTypes(myList);

		location l = new location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		return p;
		
	}
	
	public String deletePlacePayload (String placeId)
	{
	return "{\r\n    \"place_id\":\""+placeId+"\"\r\n}";
	}
	 
}
