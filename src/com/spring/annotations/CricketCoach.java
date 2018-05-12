package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Cricket Workout";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
