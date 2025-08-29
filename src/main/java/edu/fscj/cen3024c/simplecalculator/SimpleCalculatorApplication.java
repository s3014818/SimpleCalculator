// SimpleCalculatorApplication.java
// D. Singletary
// 1/9/2024
// Template for calculator application

//	Britton Sutherland 8-29-25
//	CEN3024c
//	Fall 2025
package edu.fscj.cen3024c.simplecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleCalculatorApplication {
	
	//	Addition
	public static int add(int a, int b) {
		return a + b;}
	//	Subtraction
	public static int subtract(int a, int b) {
		return a - b;}
	//	Multiplication
	public static int multiply(int a, int b) {
		return a * b;}
	// Division
	public static int divide(int a, int b) {
		return a / b;}
		
	
	
    public static void main(String[] args) {
        SpringApplication.run(SimpleCalculatorApplication.class, args);

        // Test the multiply function
        int number1 = 10; // This can be input from the user or arguments
        int number2 = 5; // This can be input from the user or arguments
        int result = multiply(number1, number2);
        System.out.println("Multiply result is: " + result);

        // Test the divide function
        result = divide(number1, number2);
        System.out.println("Divide result is: " + result);

        // Test the add function
        result = add(number1, number2);
        System.out.println("Add result is: " + result);

        // Test the subtract function
        result = subtract(number1, number2);
        System.out.println("Add result is: " + result);
    }
}
