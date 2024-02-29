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

public class PatientDriverApp {

	
	public static void displayPatient(Patient patientA) {
		System.out.println(patientA);
	}
	
	
	public static void displayProcedure(Procedure procedureA) {
		String procedure = "\tProcedure: " + procedureA.getProcedureName() + "\n";
		String procedure_date = "\tProcedureDate: " + procedureA.getProcedureDate() + "\n";
		String practitioner = "\tPractitioner: " + procedureA.getPractitionerName() + "\n";
		String charges = "\tCharge: " + procedureA.getProcedureCharges();
		System.out.println(procedure + procedure_date + practitioner + charges);
	}
	
	public static double calculateTotalCharges (Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return (procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges());
	}
	
	public static void main(String[] args) {

		System.out.println("Patient info: ");
		Patient patient1 = new Patient("Jenny", "Elaine", "Santori", "123 Main St", "MyTown", "California", "01234", "123-456-7890", "Bill Santori", "777-555-1212");
		displayPatient(patient1);
		System.out.println();
		
		Procedure procedure1 = new Procedure("Physical exam", "7/20/2019", "Dr. Irvine", 3250.00);
		Procedure procedure2 = new Procedure("X-ray", "7/20/2019", "Dr. Jameson", 5500.43);
		Procedure procedure3 = new Procedure("Blood test", "7/20/2019", "Dr. Smith", 1400.77);
		displayProcedure(procedure1);
		System.out.println();
		displayProcedure(procedure2);
		System.out.println();
		displayProcedure(procedure3);
		System.out.println();
		
		double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
		String formatCharges = String.format("%,.2f",totalCharges);
		System.out.print("Total Charges: " + "$" + formatCharges);
		
		
		System.out.println("Student name: Matt Florez");
		System.out.println("MC#: MC2*****88");
		System.out.println("Due date: 2/26/2024");
	}

}
