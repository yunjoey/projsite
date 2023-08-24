package com.joe.MockitoSite.Pages;

import org.springframework.stereotype.Component;

import Services.WeatherAccessor;

@Component
public class Blue {
	public String getText() {
		WeatherAccessor w = new WeatherAccessor();
		return w.getWeather();
	}
}
