// This exercise tests and prints objects of an Employee's first name, surname, and year of joining
public class Employee {
	
	private String firstName;
	private String surname;
	int yearOfJoining;

	public Employee(String firstName, String surname, int yearOfJoining) { // Constructor of the 3 field variables
		this.firstName = firstName;
		this.surname = surname;
		this.yearOfJoining = yearOfJoining;
	}
	public void setFirstName(String firstName) { // Setters and getters of Employee class for each field variable
		this.firstName = firstName;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	@Override
	public String toString() { // Prints the Employee class objects
		return "Employee [firstName=" + firstName + ", surname=" + surname + ", yearOfJoining=" + yearOfJoining + "]";
	}
}
