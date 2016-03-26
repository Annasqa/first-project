/**
 *   File Name: FirstProjectMonth.java<br>
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
 * FirstProjectMonth //ADDD (description of class)
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
public class FirstProjectMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the month number ");
		String input = scanner.nextLine();
		int monthnum = Integer.parseInt(input);

		switch (monthnum) {
		case 1:
			System.out.println("January");
			break;

		case 2:
			System.out.println("February");
			break;

		case 3:
			System.out.println("March");
			break;

		case 4:
			System.out.println("April");
			break;

		case 5:
			System.out.println("May");
			break;

		case 6:
			System.out.println("June");
			break;

		case 7:
			System.out.println("July");
			break;

		case 8:
			System.out.println("August");
			break;

		case 9:
			System.out.println("September");
			break;

		case 10:
			System.out.println("October");
			break;

		case 11:
			System.out.println("November");
			break;

		case 12:
			System.out.println("December");
			break;

		default:
			break;
		}

	}

}
