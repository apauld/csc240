
public class MyObjectOrientedRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person aaron =  new Person();
		aaron.setFirstName("Aaron");
		aaron.setLastName("Dix");
		aaron.setAddress("123 Main St");
		aaron.setCity("Denver");
		aaron.setState("CO");
		aaron.setZip(80000);
		
		System.out.println(aaron);
		
		aaron.speak("Hello Object Oriented World!");

	}

}
