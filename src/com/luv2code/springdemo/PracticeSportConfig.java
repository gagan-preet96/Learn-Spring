package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
//@PropertySource("classpath:sport.properties")
public class PracticeSportConfig {

	//define bean for our sad fortune service
	@Bean
	public FortuneService cricketFortuneService() {
		return new CricketFortuneService();
	}
	
	//define bean for our swim coach and inject dependencies for the swim coach
	@Bean
	public Coach cricketCoach() {
		return new CricketCoach(cricketFortuneService());
	}
}
