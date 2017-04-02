import java.io.IOException;
import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CrawlerCarelink {

	public static String Username;
	public static String Password;
	public static String StartDate;
	public static String EndDate;
	public static Boolean TrueorFalse;

	private static Scanner keyboard;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		keyboard = new Scanner(System.in);

		System.out.println("Starting Unit Test case for Carelink Crawler");

		System.out.println("Please Enter user name");
		Username = keyboard.nextLine();

		System.out.println("Please Enter Password");
		Password = keyboard.nextLine();

		System.out.println("Note: Date should be in Format of DD/MM/YYYY  Example: 13/03/2017.");
		System.out.println(
				"Start and end date should not be less than 01/01/1998 and should not be greater than Today's date.");
		System.out.println("End date should not be less than Start date.");

		System.out.println("Please Enter Start Date");
		StartDate = keyboard.nextLine();

		System.out.println("Please Enter End Date");
		EndDate = keyboard.nextLine();

		EnterBooleanValueForTestResults bool = new EnterBooleanValueForTestResults();

		TrueorFalse = bool.WhatShouldBeTheOutputs();
		if (TrueorFalse == true || TrueorFalse == false) {

			// Here Junit class will run and produce test results.

			Result result = JUnitCore.runClasses(JunitShouldFilebeDownloaded.class);

			for (Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
			}

			System.out.println("Test case Result is : " + result.wasSuccessful());
		}

		else {
			System.out.println("You Entered wrong ");
		}
	}

}
