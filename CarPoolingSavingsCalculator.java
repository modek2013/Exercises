import java.util.Scanner;

public class CarPoolingSavingsCalculator
{
    public static void main(String[] args)
    {
	int TotalMilesDrivenPerDay;
	int CostPerGallonOfGasoline;
	int AverageMilesPerGallon;
	int ParkingFeePerDay;
	int TollsPerDay;
	int DailyDrivingCost;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Total Miles Driven Per Day ");
	TotalMilesDrivenPerDay = input.nextInt();

	System.out.println("Enter Cost Per Gallon Of Gasoline ");
	CostPerGallonOfGasoline = input.nextInt();

	System.out.println("Enter Average Miles Per Gallon ");
	AverageMilesPerGallon = input.nextInt();	
	
	System.out.println("Enter Parking Fee Per Day ");
	ParkingFeePerDay = input.nextInt();

	System.out.println("Enter Tolls Per Day ");
	TollsPerDay = input.nextInt();

	DailyDrivingCost = ((TotalMilesDrivenPerDay / AverageMilesPerGallon) * CostPerGallonOfGasoline + ParkingFeePerDay + TollsPerDay);

	System.out.println("Wow! Your total Driving cost for today is:" + DailyDrivingCost);
    }
}
