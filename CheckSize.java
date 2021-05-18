import java.util.Scanner;

public class CheckSize
{
     public static void main(String args[])
     {
	Scanner input = new Scanner(System.in);
	String size;
	System.out.println("Welcome enter your shoe number");
	int number = 	 input.nextInt();
	
	switch(number)
	{
	    case 23: 
		size = "small" ;
		break;
	    case 35: 
		size = "medium" ;
		break; 
	    case 40: 
		size = "big" ;
		break;
	    case 45: 
		size = "large" ;
		break; 
	    case 50: 
		size = "Xtralarge" ;
		break;
	    case 55: 
		size = "ExtraExtra";
		break; 
	    default: 
		size = "Invalid size" ;
	    	break;
	}
	System.out.println("Great we have your size,you are:"+ size);
    }
}
