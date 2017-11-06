// This exercise has has us printing a fraction, adding, multiplying, and comparing fractions as well
public class Fraction {
	int numerator;
	int denominator;
	
	public Fraction(int numerator, int denominator) { // Created the constructor for the numerator and denominator
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public double getNumerator() { // We only want to get a numerator and denominator in this exercise
		return numerator;
	}

	public double getDenominator() {
		return denominator;
	}

	@Override
	public String toString() { // We print out what a fraction should look like
		return numerator + "/" + denominator;
	}

	public Fraction add(Fraction summand) { // Adding a fraction
		int addFirst = (numerator * summand.denominator) + (summand.numerator * denominator);
		int addSecond = denominator * summand.denominator;
		Fraction addition = new Fraction(addFirst,addSecond);
		return addition;
		
	}
	public Fraction multiply(Fraction factor) { // Multiplying a fraction
		int prodNum = numerator * factor.numerator;
		int prodDenom = denominator * factor.denominator;				
		Fraction product = new Fraction(prodNum,prodDenom);
		return product;
	
	}
	public boolean less(Fraction comp) { //Evaluating whether or not fraction 1 is less than fraction 2 with true or false
			double fracOne = ((double)numerator / (double)denominator);
			double fracTwo = ((double)comp.numerator / (double)comp.denominator);
				if (fracOne < fracTwo)
					return true;
				else
					return false;
	}
}
