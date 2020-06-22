package InitialPrograms;
import java.io.*;

public class Factorial {
	public static void main(String[] args)
	{
		int fact=1,i;
		System.out.println("Enter the number");
		int n= new java.util.Scanner(System.in).nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The fact of "+n+"is "+fact);
	}

}
