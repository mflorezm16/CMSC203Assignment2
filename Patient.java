/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: (Give a brief description for each Class)
 * Due: 2/26/2024
 * Platform/compiler: Eclipse JDK
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Matt
*/


package patient;

public class Patient {
	
	// Data members
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhoneNumber;

	
	// 1st constructor (no ARG)
	public Patient() {
	
	}
	
	// 2nd constructor
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	// 3rd constructor
	public Patient(String firstName, String middleName, String lastName, String streetAdress, String city, String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhoneNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAdress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}
	
	
	// Accessor methods
	public String getFirstName(){
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	
	public String getEmergencyContactPhoneNumber() {
		return emergencyContactPhoneNumber;
	}
	
	
	
	// Mutator methods
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public void setMiddleName (String newMiddleName) {
		middleName = newMiddleName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public void setStreetAddress(String newStreetAddress) {
		streetAddress = newStreetAddress;
	}
	
	public void setCity(String newCity) {
		city = newCity;
	}
	
	public void setState(String newState) {
		state = newState;
	}
	
	public void setZipCode(String newZipCode) {
		zipCode = newZipCode;
	}
	
	public void setPhoneNumber (String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}
	
	public void setEmergencyContactName(String newEmergencyContactName) {
		emergencyContactName = newEmergencyContactName;
	}
	
	public void setEmergencyContactPhoneNumber(String newEmergencyContactPhoneNumber) {
		emergencyContactPhoneNumber = newEmergencyContactPhoneNumber; 
	}
	
	
	// Concatenation methods
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	public String buildAddress() {
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}
	
	public String buildEmergencyContact() {
		return emergencyContactName + " " + emergencyContactPhoneNumber;
	}
	
	//to String
	public String toString() {
		String name = "Name: " + buildFullName() +"\n";
		String phone_number = "Phone number: " + phoneNumber + "\n";
		String address = "Address: " + buildAddress() + "\n";
		String emergency_contact = "Emergency contact: " + buildEmergencyContact();
		return name + phone_number + address + emergency_contact;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Patient p1 = new Patient("Mike", "I", "Wazowski", "Street address", "Boston", "Massachusets", "20854","Phone number", "emergency contact name", "emergency contact phone number");
		System.out.println(p1);
	}
}

