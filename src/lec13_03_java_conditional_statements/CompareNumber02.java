package lec13_03_java_conditional_statements;

/*
Conditional Statement:
Conditional Statements allow the program to behave differently based on condition. 
Example: if, else, else if, switch. 
Regarding condition: First condition is always if.
Generally we don't use - 2 if condition (code wise OK), 
rather we use 'if' as first condition and 'else or else if' as second condition. 
Generally the true statement is written at the end.
When we write 'else', no condition is necessary to write,
Whatever you want to print, it will be printed in else block. either it is true or false, correct or incorrect, it doesn't matter
 */

public class CompareNumber02 {

	public static void main(String[] args) {
		int val1 = 35;
		int val2 = 54;

		if (val1 < val2) { // inside the () -- condition is present, if condition is true then this if block will be executed
			System.out.println(val1 + " is less than " + val2);
		} else {
			System.out.println(val1 + " is greater than " + val2);
		}
		
	}

}
