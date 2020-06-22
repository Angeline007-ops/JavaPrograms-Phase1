package InitialPrograms;
import java.io.*;
import java.lang.*;

public class Add 
{	
  public static void main(String args[])
		{			
			java.util.Scanner scan = new java.util.Scanner(System.in);
			System.out.println("Enter the numbers");
			int firstNum = scan.nextInt();
			int secondNum = scan.nextInt();
			new Add().addition(firstNum,secondNum);
		}
		void addition(int x,int y)
		{
		    int result=x+y;
			displayOutput(result);
		}
		void displayOutput(int result)
		{
			System.out.println("Addition : " + result);
		}
}
