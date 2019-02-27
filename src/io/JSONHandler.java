package io;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;


public class JSONHandler {
	@SuppressWarnings("unchecked")
	public static void createJson(String filename, double lati, double longi, String orient, String shape, String backC, String alphaNum, String alphaNumC) {
		JSONObject jo = new JSONObject();

		jo.put("type", "standard");
		jo.put("latitude", lati);
		jo.put("longitude", longi);
		jo.put("orientation", orient);
        jo.put("shape", shape);
        jo.put("background_color", backC);
        jo.put("alphanumeric", alphaNum);
        jo.put("alphanumeric_color", alphaNumC);
		
		//makes the JSON file
		try(FileWriter file = new FileWriter(filename))
		{
			file.write(jo.toString());
			file.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}


}