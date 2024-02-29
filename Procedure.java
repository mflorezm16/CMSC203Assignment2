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

public class Procedure {

	
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double procedureCharges;
	
	// 1st constructor (no ARG)
	public Procedure() {
		
	}
	
	//2nd constructor
	public Procedure(String procedureName, String procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate; 
	}
	
	//3rd constructor
	public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate; 
		this.practitionerName = practitionerName;
		this.procedureCharges = procedureCharges;
	}
	
	
	public String getProcedureName(){
		return procedureName;
	}
	
	public String getProcedureDate(){
		return procedureDate;
	}
	
	public String getPractitionerName(){
		return practitionerName;
	}
	
	public double getProcedureCharges(){
		return procedureCharges;
	}
	
	
	
	public void setProcedureName(String newProcedureName) {
		procedureName = newProcedureName;
	}
	
	public void setProcedureDate(String newProcedureDate) {
		procedureDate = newProcedureDate;
	}
	
	public void setPractitionerName(String newPractitionerName) {
		practitionerName = newPractitionerName;
	}
	
	public void setProcedureCharges(double newProcedureCharges) {
		procedureCharges = newProcedureCharges;
	}
	
	
	public String toString() {
		String procedure = "Procedure: " + procedureName + "\n";
		String procedure_date = "ProcedureDate: " + procedureDate+ "\n";
		String practitioner = "Practitioner: " + practitionerName + "\n";
		String charges = "Charge: " + procedureCharges;
		return procedure + procedure_date + practitioner + charges;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Patient p1 = new Patient("Mike", "I", "Wazowski", "Street address", "Boston", "Massachusets", "20854","Phone number", "emergency contact name", "emergency contact phone number");
		System.out.println(p1);
	}
	
}
