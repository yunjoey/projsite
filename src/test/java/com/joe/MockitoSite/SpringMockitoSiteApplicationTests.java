package com.joe.MockitoSite;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import Services.Weather.ApiResponse;
import Services.Weather.DailyData;
import Services.Weather.DailyUnits;
import Services.Weather.WeatherService;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class SpringMockitoSiteApplicationTests {

	
	@Test
	void okweather() {
		WeatherService w = mock(WeatherService.class);
		when(w.getStatus()).thenReturn("ok");
		assert(w.getWeatherString()==null);
	}
	
	@Test
	void apistring() {
		WeatherService w = mock(WeatherService.class);
		ApiResponse a = new ApiResponse();
		
		DailyData dat = mock(DailyData.class);
		DailyUnits units = mock(DailyUnits.class);
		
		a.setDaily(dat);
		a.setDaily_units(units);
		when(dat.toString()).thenReturn("DailyDataMock");
		when(units.toString()).thenReturn("DailyUnitsMock");
		
		assert(
				"latitude:0.0 longitude:0.0 generationtime_ms: 0.0 utc_offset_seconds: 0 timezone: null timezone_abbreviation: null elevation: 0.0 daily_units: {DailyUnitsMock} daily: {DailyDataMock}"
				.equals(a.toString()));
	}

}
