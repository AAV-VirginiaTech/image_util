package io;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//download @ http://www.java2s.com/Code/Jar/j/Downloadjsonsimple111jar.htm


public class JSONHandler {
	@SuppressWarnings("unchecked")
	public static void jsonCreate(double lati, double longi, String orient, String shape, String backC, String alphaNum, String alphaNumC) {
		JSONObject obj = new JSONObject();

		
		JSONArray list = new JSONArray();
		list.add("Type: Standard");
		list.add(String.format("Latitude: %d", lati));
		list.add(String.format("Longitude: %d", longi));
		list.add(String.format("Orientation: %s", orient));
		list.add(String.format("Shape: %s", shape));
		list.add(String.format("Background_Color: %s" + backC));
		list.add(String.format("Alphanumeric: %s" + alphaNum));
		list.add(String.format("Alphanumeric_Color: %s",alphaNumC));
		
		
		//makes the JSON file
		try(FileWriter file = new FileWriter("myJson.json"))
		{
			file.write(obj.toString());
			file.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(obj);
	}


};

public static void main(String[] args) {
	JSONHandler.jsonCreate(3.00,3.00, "North", "Star", "Orange", "B", "Yellow");
}