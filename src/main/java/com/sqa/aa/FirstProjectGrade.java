/**
 *   File Name: FirstProjectGrade.java<br>
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
 * FirstProjectGrade //ADDD (description of class)
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
public class FirstProjectGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating Scanner object
		Scanner scanner = new Scanner(System.in);
		// Ask User to enter the number
		System.out.println("PLease enter your grade ");
		// gathering user entered value
		String input = scanner.nextLine();
		// transforms the number into the letter
		int num = Integer.parseInt(input);

		if (num < 41) {

			System.out.println("Your grade is D");
		} else if (num < 61) {
			System.out.println("Your grade is C");

		} else if (num < 81) {
			System.out.println("Your grade is B");
		} else if (num <= 100) {
			System.out.println("Your grade is A");
		} else
			System.out.println("PLease enter a valid number");

	}

}
