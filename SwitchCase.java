package InitialPrograms;
import java.util.*;

public class SwitchCase {
    public static void main(String[] args)
{
    String season;
    System.out.println("Enter the month");	
	int n= new java.util.Scanner(System.in).nextInt();
	switch(n)
	{
		case 12:
		case 1:
		case 2:
		season="WINTER";
		break;
		case 3:
		case 4:
		case 5:
		season="SPRING";
		break;
		case 6:
		case 7:
		case 8:
		season="SUMMER";
		break;
		case 9:
		case 10:
		case 11:
		season="AUTUMN";
		break;
		default:
			season="Invalid month";
	}
	System.out.print("The season is  "+season);	
	
	}
}
