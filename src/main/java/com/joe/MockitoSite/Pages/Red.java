package com.joe.MockitoSite.Pages;

import org.springframework.stereotype.Component;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Component
public class Red {
	
	public String getText() {
		return "Welcome to the red page";
	}
	
}
