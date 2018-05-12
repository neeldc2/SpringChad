package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SportConfig.class);
		
		//To use this, uncomment Component scan in SportConfig class
		/*Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());*/
		
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		//These values are stored in properties file
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getTeam());
		
		context.close();

	}

}
