package Services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class WeatherAccessor {
	
	String surl = "https://api.open-meteo.com/v1/forecast?latitude=35.6895&longitude=139.6917&daily=weathercode,temperature_2m_max,temperature_2m_min,apparent_temperature_max,apparent_temperature_min,sunrise,sunset,precipitation_sum,rain_sum,showers_sum,snowfall_sum,precipitation_probability_max&temperature_unit=fahrenheit&windspeed_unit=mph&precipitation_unit=inch&timezone=Asia%2FTokyo&forecast_days=1";
	
	public String getWeather(){
		try {
			URL u = new URL(surl);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.connect();
			if(conn.getResponseCode() != 200) {
				return ""+conn.getResponseCode();
			}
			String fin = "";
			Scanner scan = new Scanner(u.openStream());
			
			while(scan.hasNext()) {
				fin += scan.nextLine();
			}
			scan.close();
			return fin;
		} catch (MalformedURLException e) {
			return "URL Malformed";
		} catch (IOException e) {
			return "Couldn't connect";
		}
	}
}
