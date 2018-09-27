package ie.gmit.studentmanager;

public class StudentManager {

	// Instance variables
	// Set an initial capacity constant for the array
	// Array you need to know what size it is
	private static final int INITIAL_CAPACITY = 10;

	// Create an array to hold the student objects
	private Student[] students = null;
	private int[] studentAges;

	// Default constructor
	public StudentManager() {
		students = new Student[INITIAL_CAPACITY];
	}

	// Create methods you may need and stub them out
	public boolean add(Student student) {
		return false;
	}

	public boolean delete(String studentId) {
		return false;
	}

	public Student[] getStudentByFirstName(String firstName) {
		return null;
	}

	public int findTotalStudent() {
		return -1;
	}

}
