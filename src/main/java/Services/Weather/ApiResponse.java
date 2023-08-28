package Services.Weather;

public class ApiResponse {
	float latitude;
	float longitude;
	double generationtime_ms;
	int utc_offset_seconds;
	String timezone;
	String timezone_abbreviation;
	float elevation;
	DailyUnits daily_units;
	DailyData daily;
	
	public String toString() {
		return
				"latitude:" + latitude +
				" longitude:" + longitude +
				" generationtime_ms: " + generationtime_ms +
				" utc_offset_seconds: " + utc_offset_seconds +
				" timezone: " + timezone +
				" timezone_abbreviation: " + timezone_abbreviation +
				" elevation: " + elevation +
				" daily_units: {" + getDaily_units() + "}" +
				" daily: {" + getDaily() + "}";
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public double getGenerationtime_ms() {
		return generationtime_ms;
	}

	public void setGenerationtime_ms(double generationtime_ms) {
		this.generationtime_ms = generationtime_ms;
	}

	public int getUtc_offset_seconds() {
		return utc_offset_seconds;
	}

	public void setUtc_offset_seconds(int utc_offset_seconds) {
		this.utc_offset_seconds = utc_offset_seconds;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getTimezone_abbreviation() {
		return timezone_abbreviation;
	}

	public void setTimezone_abbreviation(String timezone_abbreviation) {
		this.timezone_abbreviation = timezone_abbreviation;
	}

	public float getElevation() {
		return elevation;
	}

	public void setElevation(float elevation) {
		this.elevation = elevation;
	}

	public DailyUnits getDaily_units() {
		return daily_units;
	}

	public void setDaily_units(DailyUnits daily_units) {
		this.daily_units = daily_units;
	}

	public DailyData getDaily() {
		return daily;
	}

	public void setDaily(DailyData daily) {
		this.daily = daily;
	}
	
	
}
