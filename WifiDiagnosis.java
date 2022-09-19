/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: Project 1; Wifi Diagnoser
 * Due: 09/18/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Naomi Fikremariam
*/

package project1;

import java.util.Scanner;
public class WifiDiagnosis {

	public static void main(String[] args) {
		
		final String positiveInput = "yes";
		final String negativeInput = "no"; 
		final String problemSolved = "Done\n" + "Programmer: Naomi Fikremariam";
		final String invalidInput = "Invalid answer; try again\n";
		final String newAttempt = "Did that fix the problem?\n";
		
		System.out.println("If you have a problem with internet connectivity"
		+ " this Wifi Diagnosis might work.\n");
		System.out.println("Reboot the computer and try to connect.\n");
		System.out.println(newAttempt);
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		
		if(positiveInput.equalsIgnoreCase(input)) {
			System.out.println(problemSolved);
		}
		else if(negativeInput.equalsIgnoreCase(input)) {
			System.out.println("Reboot the router and try to connect");
			System.out.println(newAttempt);
			String input2 = keyboard.nextLine();
			
			if(positiveInput.equalsIgnoreCase(input2)) {
				System.out.println(problemSolved);
			}
			else if(negativeInput.equalsIgnoreCase(input2)) {
				System.out.println("Make sure the cables connecting the router are "
						+ "firmly plugged in and power is getting to the router");
				System.out.println(newAttempt);
				String input3 = keyboard.nextLine();
				
				if(positiveInput.equalsIgnoreCase(input3)) {
					System.out.println(problemSolved);
				}
				else if(negativeInput.equalsIgnoreCase(input3)) {
					System.out.println("Move the computer closer to "
							+ "the router and try to connect");
					System.out.println(newAttempt);
					String input4 = keyboard.nextLine();
					
					if(positiveInput.equalsIgnoreCase(input4)) {
						System.out.println(problemSolved);
					}
					else if(negativeInput.equalsIgnoreCase(input4)) {
						System.out.println("Move the computer closer to "
								+ "the router and try to connect");
						System.out.println(newAttempt);
						String input5 = keyboard.nextLine();
						
						if(positiveInput.equalsIgnoreCase(input5)) {
							System.out.println(problemSolved);
						}
						else if(negativeInput.equalsIgnoreCase(input5)) {
							System.out.println("Contact your ISP");
							System.out.println(problemSolved);
						}
						else {
							System.out.println(invalidInput);
						}
					}
					else {
						System.out.println(invalidInput);
					}
				}
				else {
					System.out.println(invalidInput);
				}
			}
			else {
				System.out.println(invalidInput);
			}
			
		}
		else {
			System.out.println(invalidInput);
		}
		
		
	}
}
