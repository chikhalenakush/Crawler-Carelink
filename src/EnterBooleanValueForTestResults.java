import java.util.Scanner;

public class EnterBooleanValueForTestResults {
	private static Scanner keyboard;
	
	public Boolean WhatShouldBeTheOutputs() {
		try{
			System.out.println("Should File be Downloaded with given credentials? \n Type true for yes \n Type false for no");  
			keyboard = new Scanner(System.in);
			Boolean TrueorFalse = keyboard.nextBoolean();
	        return TrueorFalse;
			}
			catch(Exception e)
			{
				System.out.println("Entered Value is not Boolean");  
				 return WhatShouldBeTheOutputs();
			}
	}
}


