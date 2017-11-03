/*
 * Lab 9 by Lena Hand
 * 
 * 11/03/2017
 * 
 * This is a program to hold the details regarding a list of cars. Data is received from the user and 
 * output into a table.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// get user Input
		// Ask user how many cars they want to enter
		ArrayList<Car> carList = new ArrayList<>();
		int numOfCars = Validator.getInt(scan, "How many cars would you like to enter data for? ");

		// For each car, take input for the details
		for (int i = 0; i < numOfCars; i++) {
			String make = Validator.getString(scan, "What is the make of car " + (i + 1) + "? ");
			String model = Validator.getString(scan, "What is the model of car " + (i + 1) + "? ");
			int year = Validator.getInt(scan, "What is the year of car " + (i + 1) + "? ", 1885, 2020);
			double price = Validator.getDouble(scan, "What is the price of car " + (i + 1) + "? ", 0, Double.MAX_VALUE);
			System.out.println();
			
			// create multiple instances of a Car object
			carList.add(new Car(make, model, year, price));
		}

		// display their information
		// Print out a table of the cars at the end
		System.out.println("Inventory of Cars: ");
		
		for (Car c : carList) {
			System.out.printf("%-10s %-10s %-6d $%,10.2f\n", c.getMake(), c.getModel(), c.getYear(), c.getPrice());
		}

	}
}
