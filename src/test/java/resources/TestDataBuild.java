package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddNewPlaceData;
import pojo.LocationChild;

public class TestDataBuild {
	
	public AddNewPlaceData requestSpecification(String name,String address,String language) {
		AddNewPlaceData add = new AddNewPlaceData();
		LocationChild l = new LocationChild();
		l.setLat(-38.383494);
		l.setLng(33.427362);

		add.setLocation(l);
		add.setAccuracy(50);
		add.setName(name);
		add.setPhone_number("9876543210");
		add.setAddress(address);

		List<String> list = new ArrayList<>();
		list.add("shoe park");
		list.add("shop");

		add.setTypes(list);
		add.setWebsite("https://google.com");
		add.setLanguage(language);
		return add;
	}

}
