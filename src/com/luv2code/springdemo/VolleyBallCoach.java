package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class VolleyBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "practice dunk shot for 20mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
