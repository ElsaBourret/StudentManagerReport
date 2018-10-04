package ie.gmit.studentmanager;

import java.util.*; // For Date obj

public class Student {
	private String name;
	private String firstName;
	private String surname;
	private Date dob;
	private Address address;
	private Course course;
	private int age;

	// Constructor
	public Student() {
		this.name = "Student name";
		this.course = null;
		this.age = 0;
	}

	// Instance methods
	// Get name
	public String getName() {
		// stores and returns name
		return name;
	}

	// set name
	public void setName(String newName) {

	}

}
