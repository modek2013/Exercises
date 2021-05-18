// Fig. 5.7, Page 193
// Financial application: compute future tuition.

public class TutionFee
{
    public static void main(String[] args)
    {
	double tution = 10000.0 ; //tution for a university
	double rate = 0.05 ;  //increase rate 
	double futureTution ; //computed fee for future tution
	
	System.out.printf("Here is the computation of the tution fee :\n %6s%15s", "Years", "TutionFee");	

	for(int year=1; year<=10; year++)
	{
	    futureTution = tution * Math.pow( (1.0 + rate,year);
	    System.out.printf("%7d%16d", year, futureTution);
	}
    }
}