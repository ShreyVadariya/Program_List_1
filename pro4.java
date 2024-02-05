// Write a Java program that take an integer input (n) and find reverse number of given number.

import java.util.Scanner;
public class pro4 
{
    public static void main(String[] args) 
	{
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter any number :: ");
    	int n = scanner.nextInt();

    	int reverse = reverseNumber(n);
    	System.out.println("Reverse of " + n + " is :: " + reverse);

    	scanner.close();
	}
    public static int reverseNumber(int number) 
    {
        int reversedNumber = 0;

        while (number != 0) 
	    {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }  
}