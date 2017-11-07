/**
* @author Jacob Smith
* This exercise converts kilograms into pounds, displays kilograms, and
* converts kilograms into ounces
*/

public class Weight {

	double kg;
	double pounds;
	double ounces;

	public Weight(double kg) { // We only need to add kg to the constructor because the other field variables since the other values
							   // are found through the methods
		this.kg = kg;
	}


	public double getPounds() { // Converts kg into lbs
		double pounds =  kg/ 0.45359237;
		return pounds;
	}

	public double getKilograms() { // Displays value for kg
		return kg;
	}

	public double getOunces() { // Converts kg into ounces
		double ounces = kg * (16 / 0.45359237);
		return ounces;
	}
}
