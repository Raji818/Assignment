/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class SumWithoutPlus {

public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter first number");
  int a =sc.nextInt();
  System.out.println("enter second number");
  int b =sc.nextInt();
  int sum=a+b;
  System.out.println("the sum of a and b is:"+sum);
}
}