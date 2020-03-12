package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketJavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(PracticeSportConfig.class);
		
		//get bean from spring container
	   	CricketCoach theCoach = context.getBean("cricketCoach",CricketCoach.class);
	   	
		//call a method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//close context
		context.close();
	}

}
