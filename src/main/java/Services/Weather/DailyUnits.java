package Services.Weather;

public class DailyUnits {
	String time;
	String weathercode;
	String temperature_2m_max;
	String temperature_2m_min;
	String apparent_temperature_max;
	String apparent_temperature_min;
	String sunrise;
	String sunset;
	String precipitation_sum;
	String rain_sum;
	String showers_sum;
	String snowfall_sum;
	String precipitation_probability_max;
	
	public String toString() {
		return
				"time: " + time +
				" weathercode: " + weathercode +
				" temperature_2m_max: " + temperature_2m_max +
				" temperature_2m_min: " + temperature_2m_min +
				" apparent_temperature_max: " + apparent_temperature_max +
				" apparent_temperature_min: " + apparent_temperature_min +
				" sunrise: " + sunrise +
				" sunset: " + sunset +
				" precipitation_sum: " + precipitation_sum +
				" rain_sum: " + rain_sum +
				" showers_sum: " + showers_sum +
				" snowfall_sum: " + snowfall_sum +
				" precipitation_probability_max: " + precipitation_probability_max;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getWeathercode() {
		return weathercode;
	}

	public void setWeathercode(String weathercode) {
		this.weathercode = weathercode;
	}

	public String getTemperature_2m_max() {
		return temperature_2m_max;
	}

	public void setTemperature_2m_max(String temperature_2m_max) {
		this.temperature_2m_max = temperature_2m_max;
	}

	public String getTemperature_2m_min() {
		return temperature_2m_min;
	}

	public void setTemperature_2m_min(String temperature_2m_min) {
		this.temperature_2m_min = temperature_2m_min;
	}

	public String getApparent_temperature_max() {
		return apparent_temperature_max;
	}

	public void setApparent_temperature_max(String apparent_temperature_max) {
		this.apparent_temperature_max = apparent_temperature_max;
	}

	public String getApparent_temperature_min() {
		return apparent_temperature_min;
	}

	public void setApparent_temperature_min(String apparent_temperature_min) {
		this.apparent_temperature_min = apparent_temperature_min;
	}

	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	public String getPrecipitation_sum() {
		return precipitation_sum;
	}

	public void setPrecipitation_sum(String precipitation_sum) {
		this.precipitation_sum = precipitation_sum;
	}

	public String getRain_sum() {
		return rain_sum;
	}

	public void setRain_sum(String rain_sum) {
		this.rain_sum = rain_sum;
	}

	public String getShowers_sum() {
		return showers_sum;
	}

	public void setShowers_sum(String showers_sum) {
		this.showers_sum = showers_sum;
	}

	public String getSnowfall_sum() {
		return snowfall_sum;
	}

	public void setSnowfall_sum(String snowfall_sum) {
		this.snowfall_sum = snowfall_sum;
	}

	public String getPrecipitation_probability_max() {
		return precipitation_probability_max;
	}

	public void setPrecipitation_probability_max(String precipitation_probability_max) {
		this.precipitation_probability_max = precipitation_probability_max;
	}
	
	
}
