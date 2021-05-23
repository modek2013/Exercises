import java.util.Scanner;

public class CountSumAverage
{
    public static void main(String args[])
    {
	int numbers= 0;
    	int posCount=0;
	int sum=0;
    	int negCount=0;
	String output ="Invalid number";
    	// int sum=0;
    	// double avrage=0;

    	Scanner input = new Scanner(System.in);

	while(numbers != 0)
	{
	    System.out.println("kindly enter your number");
	    numbers = input.nextInt();
	    sum += numbers;

	    if(numbers>0)
	    {
	        posCount++;
	    }
	    if(numbers<0)
	    {
	        negCount++;
	    }
   	}
	System.out.println(output);
	    
    }
}
	