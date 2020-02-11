
import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		//Initialize variable 
		Scanner scan = new Scanner(System.in);
		double temperature;
		double windSpeed;
		final double LOWTEMPRANGE = -45;
		final double HIGHTEMPRANGE = 40;
		final double LOWWINDRANGE = 5;
		final double HIGHWINDRANGE = 60;
		
		// Header
		System.out.println("Wind Chill Calculator\n");
		
		//Temperature Input
		System.out.println("Please enter temperaure in Farenheit: ");
		System.out.println("(Please note that temperature must be >= " + LOWTEMPRANGE + " and <= " + HIGHTEMPRANGE + ")");
		temperature = scan.nextDouble();

		//Wind Speed Input 
		System.out.println("Please enter wind speed: ");
		System.out.println("(Please note that wind speed must be >= " + LOWWINDRANGE + " and <= " + HIGHWINDRANGE + ")");
		windSpeed = scan.nextDouble();

		//Formula for wind chill
		double total = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16))+ 0.4275 * temperature * Math.pow(windSpeed, 0.16);

		System.out.println("Wind chill temperature: " + total);
		
		
		// Footer
		System.out.println("Programmer: Sabila Bernard");
		
		scan.close();
	}

}
