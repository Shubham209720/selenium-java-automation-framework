package Helpers;

import java.net.HttpURLConnection;
import java.net.URL;

public class LinkHelper {
	
	public static int getResponseCode(String url) throws Exception
	{

        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setRequestMethod("GET");
        con.connect();
        return con.getResponseCode();
        
    }

}
