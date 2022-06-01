package com.revature.eval.java.core;

public class Tester {

	public static void main(String[] args) {
		System.out.println(EvaluationService.SpeedConverter.printConversion(1.5));
		
		EvaluationService es = new EvaluationService();
		System.out.println(es.areEqualByThreeDecimalPlaces(-3.1756, -3.175));

		System.out.println(es.printYearsAndDays(525600));
	}
	
}
