/**
* 	Author: Jiaqi Chen
*	Date: Janurary 30, 2021
*	Time: 1:02pmChallange 2
*Application Purposes: 
*Challange2
*Step 1	Write a class declaration called JavaCodeTester2 
*Step 2	Within the class declaration write the main method.
*Step 3	Within the main method write code to complete the tasks listed below, starting in step 4.
*Step 4	Store three String values in three different variables with appropriate names. 
*Step 5	Concatenate the three Strings and store the concatenated String in a new variable 
*	with an appropriate name.
*Step 6	Display the 3rd and 5th and 7th character of the concatenated string, on the same line and display an appropriate message telling the user the meaning of the characters that were printed.
*Step 7	Display the Boolean value which indicates if the concatenated string from step 5 starts with test.
*Step 8	Display the concatenated string from step 5 in all upper case letters.
*Step 9	Store an integer value in a variable with an appropriate name.
*Step 10	Use the increment operator to display the value of the variable.  (place the increment operator before the variable name)
*Step 11	Use the increment operator to display the value of the variable.  (place the increment operator after the variable name)
*	(Do you notice something odd with the print outs?)
*Challenge 3
*Step 1	Within JavaCodeTester2 write code to store an integer value in a variable with an appropriate name.
*Step 2	Determine if the integer is odd or even using the modulus operator, also use the if statement (see usage details below) to display the word odd if it is an odd number, and even if it is an even number.
*/
public  class JavaCodeTester2
{
	public static void main (String [] args) 
	{
		String greetingPart1 = "Hello"; /*Note: Remember Semicolumn*/
		String greetingPart2 = "Our";
		String greetingPart3 = "World";
		String greeting=greetingPart1+greetingPart2+greetingPart3;
		System.out.println(greeting);
		/**HelloOurWorld 3th l 5th o 7th u*/
		char thirdLetter= greeting.charAt(2); 
		/*System.out.println(thirdLetter);*/
		char fifthLetter= greeting.charAt(4);
		/*System.out.println(fifthLetter);*/
		char seventhLetter=greeting.charAt(6); /*System capital words s*/
		System.out.println("the 3rd, 5th, and 7th character of the target concatenated string HelloOurWorld are:"+thirdLetter+","+fifthLetter+","+seventhLetter+" respectively");

		/*7.Display the Boolean Value which indicates if the concatenated string from step 5 starts with the word "test". */

		System.out.println(greeting.startsWith("test"));

		/*8 Display the concatenated string from step 5 in all upper case letters. */
		String combLetter=""+thirdLetter+fifthLetter+seventhLetter;
		System.out.println(combLetter.toUpperCase());  
		
		/*9 Store an integer value in a variable with an approriante name*/
		int age=31;
		/*10 the increment operator before the variable name to display the value*/
		System.out.println(++age);
		/*11 the increment operator after the variable name*/
		System.out.println(age++);
		/**Observation: The location of the incremeter operator (either before or after the name) does not affect the result*/

		//*Challenge 3*/ 
		/*Step 1: Store integer value in a variable*/
		/*page 13 of the deck reference https://www.edureka.co/blog/mod-method-in-java/*/
		int height=184;
		int result=height%2;
		/*System.out.println(result);*/
		if (result==0) 
		{
			System.out.println("even");
		}
		else
		{	
			System.out.println("odd");
		
		}

		}
	}

