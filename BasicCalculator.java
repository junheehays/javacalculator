// Java program for simple calculator

import java.io.FileReader;
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;


public class BasicCalculator {
	public static void main(String[] args) throws Exception {
	
		//passing the path to the file as a parameter
		FileReader fr = new FileReader(
			"C:\\Users\\18018\\OneDrive\\Documents\\Winter 2023\\CSE 310\\Module #5\\calculator_test.txt");
			

			// Declaring loop variable
			int i;
			// Holds true till there is nothing to read
			while ((i = fr.read()) != -1) {
	
				// Print all the content of a file
				char num1 = (char)0;
				char num2 = (char)1;
				char op = (char)2;
				double o = 0;
				switch (op) {

					case '+':
 
						o = num1 + num2;
	 
						break;
	 
				// case to subtract two numbers
					case '-':
	 
						o = num1 - num2;
	 
						break;
	 
				// case to multiply two numbers
					case '*':
	 
						o = num1 * num2;
	 
						break;
	 
				// case to divide two numbers
					case '/':
	 
						o = num1 / num2;
	 
						break;
			}
				// print the final result
			System.out.println(num1 + op + num2 + " = " + o);
				}
		
		}
	}