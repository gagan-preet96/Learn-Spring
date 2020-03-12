package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "practice cover drive for 20 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
