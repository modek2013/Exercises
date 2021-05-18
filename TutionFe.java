// Fig. 5.7, Page 193
// Financial application: compute future tuition.

public class TutionFe
{
    public static void main( String[] args )
    {
	double futureTution; //computed future tution
 	double tution = 10000.0; // //tution for a university 
 	double rate = 0.05; // tution increase rate
	double totalTution=0;
	double newTution = 0;

	// display headers

	System.out.printf( "\nHere is the computation of the future tution for 10years:\n \n%6s%15s\n", "Years", "TutionFee" );
	// calculate increased tution for each of ten years

	for ( int year = 1; year <= 14; year++ )
	{
	    //calculate new tution for each specified year
	    futureTution = tution * Math.pow( 1.0 + rate, year );
	    // displays the year and the amount
	    System.out.printf( "The tution in%4d year(s) will be %20.2f\n", year, futureTution );

	    if(year>=10)
	    	//calculate new tution for specified year
	    	newTution += futureTution; 

	    if(year==10)
	    	//calculate total tution for 10 years
	    	totalTution += futureTution; 
	
	   
	    
	}// end for
	// display the year and the amount
	System.out.printf( "\nThe tution in 10years will be: %20.2f\n", totalTution );
	// display the year and the amount
	System.out.printf( "\nThe total cost of four years worth of tution after 10year will be:\n%20.2f", newTution );
    } // end main
} // end class TutionFe