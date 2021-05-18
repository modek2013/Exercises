import java.util.Scanner;

public class WorldPopulation
{
    public static void main(String[] args)
    {
	Double currentPopulation;
	Double growthRate;
	Double annualPopulationIncrease;
	Double estimatedworldPopulation;
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the current population");
	currentPopulation = sc.nextDouble();

	System.out.println(" Enter the growthRate");
	growthRate = sc.nextDouble();
	
	annualPopulationIncrease  = currentPopulation * (growthRate/100);
	estimatedworldPopulation = currentPopulation + annualPopulationIncrease;
	System.out.println("estimated world Population after 1 year is:" + estimatedworldPopulation); 

	System.out.println("estimated world Population for after 2 years is:" + estimatedworldPopulation + (annualPopulationIncrease*2)); 
	
	System.out.println("estimated world Population for after 2 years is:" + estimatedworldPopulation + (annualPopulationIncrease*3)); 
	
	System.out.println("estimated world Population for after 2 years is:" + estimatedworldPopulation + (annualPopulationIncrease*4)); 

	System.out.println("estimated world Population for after 2 years is:"+ estimatedworldPopulation + (annualPopulationIncrease*5)); 
	
    }
}