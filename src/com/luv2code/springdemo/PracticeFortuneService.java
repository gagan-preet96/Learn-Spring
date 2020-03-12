package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PracticeFortuneService implements FortuneService {

	private String[] quotes = {
		"pracice makes man perfect",
		"you can do it!",
		"just do it!"
	};
	
	private Random myRandom= new Random();
	
	@Override
	public String getFortune() {
		int index= myRandom.nextInt(quotes.length);
		String myFortune = quotes[index];
		return myFortune;
	}

}
