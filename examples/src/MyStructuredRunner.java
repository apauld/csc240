
public class MyStructuredRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		int zip;
		
		firstName = "Aaron";
		lastName = "Dix";
		address = "123 Main St";
		city = "Denver";
		state = "CO";
		zip = 80000;
		
		System.out.println(firstName + " " + lastName);
		
		speak("Hello structured world!");
		
	}
	
	public static void speak(String talk){
		System.out.println(talk);
	}

}
