/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter H value");
  int H =sc.nextInt();
  System.out.println("enter R value");
  int R =sc.nextInt();
  System.out.println(H-R);
  System.out.println(H*R);
  System.out.println(H/R);
  System.out.println(H++);
  System.out.println(H--);
  System.out.println(R++);
  System.out.println(R--);
  System.out.println(H%R);
  System.out.println(R%H);
}
}