/**
 *   File Name: FirstProjectGradeAverageCalculation.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

package com.sqa.aa;

import java.util.*;

/**
 * FirstProjectGradeAverageCalculation //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class FirstProjectGradeAverageCalculation {
	private static Scanner scanner = new Scanner(System.in);
	static double avgGrade;
	static double count;
	static boolean hasMoreNumbers = true;
	static double totalSum;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a loop which keeps executing until condition is false
		while (hasMoreNumbers) {
			// Adds grade value to totalSam of grades
			addGradeValue();
			// Sets the condition to the result of method that asks user if they
			// want to continue
			hasMoreNumbers = askUserForMoreInput();
		}
		// Calculate the average for the grades supplied
		evaluateGrade();
		// Display the average grade calculated
		displayGrade();

	}

	/**
	 *
	 */
	private static void addGradeValue() {
		System.out.println("Enter grade value " + (count + 1) + ":");
		String input = scanner.nextLine();
		double num = Double.parseDouble(input);
		totalSum += num;
		count++;
	}

	/**
	 * @return
	 */
	private static boolean askUserForMoreInput() {
		// continueing to ask user if they want to contione until they enter a
		// valid entry
		while (true) {
			// Ask the user if they want to continue
			System.out.print("Would you like to continue? (Yes/y) or (No/n)");
			// GAther user input into input variable
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"))
				return true;
			else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				return false;
			} else {
				System.out.println("Invalid entry: " + input);
			}
		}
	}

	/**
	 *
	 */
	private static void displayGrade() {
		System.out.println("Your avg grade is " + avgGrade);

	}

	/**
	 *
	 */
	private static void evaluateGrade() {
		// Calculate grade average
		avgGrade = totalSum / count;

	}

}
