/**
* @author Jacob Smith
* In this exercise we're producing a students name, date of birth, student ID,
* and degree programme
*/

public class Student {
	private String name;
	private String dateOfBirth;
	private String studentID;
	private String degreeProgramme;

	public Student(String name, String dateOfBirth, String studentID, String degreeProgramme) { // We have the constructors of the field variables
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.studentID = studentID;
		this.degreeProgramme = degreeProgramme;

	}

	public String getName() { // We only need getters for each variable as we're not setting them
		return name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getDegreeProgramme() {
		return degreeProgramme;
	}

	@Override
	public String toString() { // This toString prints out the objects for a new student
		return "[" + name + ", " + dateOfBirth + ", ID: " + studentID
				+ ", " + degreeProgramme + "]";
	}

}
