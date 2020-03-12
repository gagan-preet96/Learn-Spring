package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("practiceFortuneService")
   private FortuneService fortuneService;
	
   //define a default constructor
   public TennisCoach()
   {
	   System.out.println("inside default constructor");
   }
   
   
   //define my init method
   @PostConstruct
   public void doMyStartupStuff() {
	   System.out.println(">> TennsiCoach :inside doMyStartupStuff()");
   }
   
   //define my destroy method
   @PreDestroy
   public void doMyCleanupStuff() {
	   System.out.println(">>TennisCoach : inside doMyCleanupStuff()");
   };
   
   /*
   //define a setter
   @Autowired
   public void setFortuneService(FortuneService theFortuneService) {
	   System.out.println("inside setFortuneService method ");
		fortuneService = theFortuneService;
	}
   */
   
   // any method in the class example
   /*
   @Autowired
   public void doSomeCrazyStuff(FortuneService theFortuneService) {
	   System.out.println("inside doSomeCrazyStuff method ");
		fortuneService = theFortuneService;
	}
	*/
   
   /*
   @Autowired
	public TennisCoach(FortuneService theFortuneService) {
		 fortuneService = theFortuneService;
	}
   */
   
	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
