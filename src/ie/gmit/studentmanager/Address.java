package ie.gmit.studentmanager;

public class Address {
	private int houseNumber;
	private String street;
	private String county;
	private String eircode;

	//Address method 
	public Address(String eircode) {
		this.eircode = eircode;
	}

}
