package com.joe.MockitoSite.Pages;

import org.springframework.stereotype.Component;

import Services.Weather.WeatherService;

@Component
public class Blue {
	public String getText() {
		WeatherService w = new WeatherService();
		return w.getWeatherString();
	}
}
