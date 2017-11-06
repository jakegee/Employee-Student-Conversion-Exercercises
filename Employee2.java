// In this exercise we show an employee's identity and salary for time worked
public class Employee2 {

	private String name;
	double hourlySalary;
	int numberOfHours;
	double monthlySalary;
	double increaseSalary;
	double percentage;

	public Employee(String name, double hourlySalary, int numberOfHours) { // We have constructors for the field variables not developed in the method
		this.name = name;
		this.hourlySalary = hourlySalary;
		this.numberOfHours = numberOfHours;
	}

	public String getName() { // Appropriate getters and setters for employee name, hourly salary, and number of hours worked
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
	public double monthlySalary() { // Calculation to return the monthly salary
		double monthlySalary = numberOfHours * hourlySalary;
		return monthlySalary;
	}
	public void increaseSalary(double percentage) { // Calculation for increasing the hourly salary with a conversion for percentage increased
		double increaseSalary = hourlySalary * (0.01 * percentage);
		hourlySalary = hourlySalary + increaseSalary;
	}
	@Override
	public String toString() { // the toString that prints out all the class objects
		return "Employee [name=" + name + ", hourlySalary=" + hourlySalary + ", numberOfHours=" + numberOfHours
				+ ", monthlySalary=" + monthlySalary + ", increaseSalary=" + increaseSalary + ", monthlySalary()="
				+ monthlySalary() + "]";
	}

}
