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
		list.add("Type:  Standard");
		list.add("Latitude:  " );
		list.add(lati);
		list.add("Longitude:  ");
		list.add(longi);
		list.add("Orientation:  ");
		list.add((orient));
		list.add("Shape:  ");
		list.add((shape));
		list.add("Background_Color:  ");
		list.add((backC));
		list.add("Alphanumeric:  ");
		list.add((alphaNum));
		list.add("Alphanumeric_Color:  ");
		list.add((alphaNumC));
		
		
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


}
class jsonTester {
	public void test(){
		JSONHandler.jsonCreate(3.00,3.00, North, Star, Orange, B, Yellow);
	}
}