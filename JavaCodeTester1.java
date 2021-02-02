/** Application Purpose: the purpose of the class is to learn and practice Java programming. The code below is to finish assignment 2 for week2 study. 
*Step 1	Write a class declaration called JavaCodeTester1
*Step 2	Within the class declaration write the main method.
*Step 3	Within the main method write code to complete the tasks listed below, starting in step 4.
*Step 4	Store a Boolean value in a variable with an appropriate name.
*Step 5	Display the value of the variable on the computer screen.
*Step 6	Store a character in a variable with an appropriate name.
*Step 7	Display the value of the variable on the computer screen.
*Step 8	Store two string values in two different variables with appropriate names.
*Step 9	Concatenate the two strings and display the concatenated value on the computer screen.
*Step 10	Store an integer value in a variable with an appropriate name.
*Step 11	Display the value of the variable on the computer screen.
*Step 12	Store a double value in a variable with an appropriate name.
*Step 13	Display the value of the variable on the computer screen.

* 	Author: Jiaqi Chen
*	Date: Janurary 30, 2021
*	Time: 1:02pm
*/

/**Challange One*/
/*1) Write a class declaration called JavaCodeTester1, 2) write the main method p.17-18*/
public class JavaCodeTester1

{ public static void main (String [] args)
	{
		/*Step4: Store a boolean value with a variable with an appropriate name*/
		boolean isName = false;
		/*Step5: Display the value of the variable on the computer screen*/
		System.out.println("The value of the Boolean variable on the computer screen is displayed as "+isName);
		/*Step6: Store a character variable with an appropriate name*/
		char lastInitial = 'C'; /*Note that for Java we need to use single quotes for literal char s, double quotes for literal String s*/ 
		/*Step7: Display the value of the variable on the computer screen*/
		System.out.println("The value of the character variable is displayed as "+lastInitial);
		/*Step 8: Store two string values in two different varaibles with appropriate names*/
		String firstName= "Jiaqi";
		String lastName= "Chen"; 
		/*Step 9: Concatenate the two strings and display the concatenated value on the computer screen*/
		System.out.println("The concatenated value on the computer screen is displayed as "+(firstName+lastName)); /*Note that for System and String command, it has to be capital letter*/
		/*Step 10: Store an integer value in a variable with an appropriate name*/ 
		int birthdayDate=24;
		/*Step 11: Display the value of the variable*/
		System.out.println("The value of the integer variable is displayed as "+birthdayDate);
		/*Step 12: Store a double value in a variable*/
		double birthdayMonYear=1990.6;
		/*Step 12: display the value of the variable*/
		System.out.println("The value of the variable is displayed as "+birthdayMonYear); 

	}

}



