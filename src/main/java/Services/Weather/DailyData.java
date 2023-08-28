package Services.Weather;

public class DailyData {
	String [] time;
	int [] weathercode;
	float [] temperature_2m_max;
	float [] temperature_2m_min;
	float [] apparent_temperature_max;
	float [] apparent_temperature_min;
	String [] sunrise;
	String [] sunset;
	float [] precipitation_sum;
	float [] rain_sum;
	float [] showers_sum;
	float [] snowfall_sum;
	int [] precipitation_probability_max;
	
	public String toString() {
		return
				"time: " + time[0] +
				" weathercode: " + weathercode[0] +
				" temperature_2m_max: " + temperature_2m_max[0] +
				" temperature_2m_min: " + temperature_2m_min[0] +
				" apparent_temperature_max: " + apparent_temperature_max[0] +
				" apparent_temperature_min: " + apparent_temperature_min[0] +
				" sunrise: " + sunrise[0] +
				" sunset: " + sunset[0] +
				" precipitation_sum: " + precipitation_sum[0] +
				" rain_sum: " + rain_sum[0] +
				" showers_sum: " + showers_sum[0] +
				" snowfall_sum: " + snowfall_sum[0] +
				" precipitation_probability_max: " + precipitation_probability_max[0];
	}

	public String[] getTime() {
		return time;
	}

	public void setTime(String[] time) {
		this.time = time;
	}

	public int[] getWeathercode() {
		return weathercode;
	}

	public void setWeathercode(int[] weathercode) {
		this.weathercode = weathercode;
	}

	public float[] getTemperature_2m_max() {
		return temperature_2m_max;
	}

	public void setTemperature_2m_max(float[] temperature_2m_max) {
		this.temperature_2m_max = temperature_2m_max;
	}

	public float[] getTemperature_2m_min() {
		return temperature_2m_min;
	}

	public void setTemperature_2m_min(float[] temperature_2m_min) {
		this.temperature_2m_min = temperature_2m_min;
	}

	public float[] getApparent_temperature_max() {
		return apparent_temperature_max;
	}

	public void setApparent_temperature_max(float[] apparent_temperature_max) {
		this.apparent_temperature_max = apparent_temperature_max;
	}

	public float[] getApparent_temperature_min() {
		return apparent_temperature_min;
	}

	public void setApparent_temperature_min(float[] apparent_temperature_min) {
		this.apparent_temperature_min = apparent_temperature_min;
	}

	public String[] getSunrise() {
		return sunrise;
	}

	public void setSunrise(String[] sunrise) {
		this.sunrise = sunrise;
	}

	public String[] getSunset() {
		return sunset;
	}

	public void setSunset(String[] sunset) {
		this.sunset = sunset;
	}

	public float[] getPrecipitation_sum() {
		return precipitation_sum;
	}

	public void setPrecipitation_sum(float[] precipitation_sum) {
		this.precipitation_sum = precipitation_sum;
	}

	public float[] getRain_sum() {
		return rain_sum;
	}

	public void setRain_sum(float[] rain_sum) {
		this.rain_sum = rain_sum;
	}

	public float[] getShowers_sum() {
		return showers_sum;
	}

	public void setShowers_sum(float[] showers_sum) {
		this.showers_sum = showers_sum;
	}

	public float[] getSnowfall_sum() {
		return snowfall_sum;
	}

	public void setSnowfall_sum(float[] snowfall_sum) {
		this.snowfall_sum = snowfall_sum;
	}

	public int[] getPrecipitation_probability_max() {
		return precipitation_probability_max;
	}

	public void setPrecipitation_probability_max(int[] precipitation_probability_max) {
		this.precipitation_probability_max = precipitation_probability_max;
	}
	
	
}
