import java.util.Scanner;

/*
This is a big block comment
Author: Aaron
Program: Does this one thing , block comment
Date: today

*/

public class Test {	
	
	public static void main(String[] args) {
	    //This is an inline comment	
	    Scanner input = new Scanner(System.in);
	    System.out.println("Age please:"); 
	    int age = input.nextInt();
	  				
	    if(age < 18)
	  	System.out.println("Not legal");
	    else
	  	System.out.println("Legal");
	  											
	}	  
}
