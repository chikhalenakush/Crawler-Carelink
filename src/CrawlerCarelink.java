import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CrawlerCarelink {

	
	private static Scanner keyboard;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  keyboard = new Scanner(System.in);
	  
	  System.out.println("Please Enter user name");
	  String Username = keyboard.nextLine();
	  
	  System.out.println("Please Enter Password");
	  String Password = keyboard.nextLine();
	  
			  System.out.println("Please Enter Start Date");  
		        String StartDate = keyboard.nextLine(); // String date
		        
		        System.out.println("Please Enter End Date");  
		        String EndDate = keyboard.nextLine(); // String date

		      Boolean TrueorFalse =   WhatShouldBeTheOutput();
		        
		        if(TrueorFalse == true || TrueorFalse == false){
		        			
		        	//JunitShouldFilebeDownloaded  temp = new JunitShouldFilebeDownloaded(Username,Password,StartDate,EndDate,TrueorFalse);
		        	
		        	
			 Result result = JUnitCore.runClasses(JunitShouldFilebeDownloaded
					 .class);
				
		      for (Failure failure : result.getFailures()) {
		         System.out.println(failure.toString());
		      }
				
		      System.out.println(result.wasSuccessful());
		   }
	
	else
	{
		 System.out.println("You Entered wrong ");  
	}
	}
	private static Boolean WhatShouldBeTheOutput() {
		// TODO Auto-generated method stub
		System.out.println("Should File be Downloaded with given credentials? \n Type true for yes \n Type false for no");  
        Boolean TrueorFalse = keyboard.nextBoolean();
        return TrueorFalse;
		
	}
	}


