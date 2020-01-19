package datastructure;

import java.util.*;

public class DataReader {

	public static void main(String[] args) {
		Stack<String> STACK = new Stack<String>();

		STACK.push("Welcome");
		STACK.push("To");
		STACK.push("PNT");

		System.out.println("Initial Stack: " + STACK);

		// Displaying the Stack
		System.out.println("The stack is: " + STACK);

		// Checking for the element "4"
		System.out.println("Does the stack contains '4'? "
				+ STACK.search("PNT"));

		System.out.println("The element at the top of the" + " stack is: " + STACK.peek());

		System.out.println("Final Stack: " + STACK);


	}

}
