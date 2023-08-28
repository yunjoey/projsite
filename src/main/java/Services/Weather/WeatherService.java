package Services.Weather;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import com.google.gson.Gson;

public class WeatherService {
	
	String surl = "https://api.open-meteo.com/v1/forecast?latitude=35.6895&longitude=139.6917&daily=weathercode,temperature_2m_max,temperature_2m_min,apparent_temperature_max,apparent_temperature_min,sunrise,sunset,precipitation_sum,rain_sum,showers_sum,snowfall_sum,precipitation_probability_max&temperature_unit=fahrenheit&windspeed_unit=mph&precipitation_unit=inch&timezone=Asia%2FTokyo&forecast_days=1";
	
	ApiResponse weatherdata;
	
	String status;
	
	public WeatherService(){
		try {
			weatherdata = getData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ApiResponse getData() throws IOException {
		URL u = new URL(surl);
		HttpURLConnection conn = (HttpURLConnection) u.openConnection();
		conn.connect();
		if(conn.getResponseCode() != 200) {
			status = ""+conn.getResponseCode();
		}
		String fin = "";
		Scanner scan = new Scanner(u.openStream());
		
		while(scan.hasNext()) {
			fin += scan.nextLine();
		}
		scan.close();
		Gson gson = new Gson();
		return gson.fromJson(fin, ApiResponse.class);
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String s) {
		status = s;
	}
	
	public String getWeatherString(){
		if(getStatus().equals("ok")) {
			return weatherdata.toString();
		}
		else return "Error: "+status;
	}
	
	public ApiResponse getWeatherData() {
		return weatherdata;
	}
	
	public void setWeatherData(ApiResponse a) {
		weatherdata = a;
	}
}
