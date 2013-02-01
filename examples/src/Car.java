public class Car{
	private String make;
	private String model;
	private int year;
	private int doors;
	
	public Car(String make, String model, int year){
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Car(){
		
	}
	
	public void setMake(String make){
		this.make = make;
	}
	public String getMake(){
		return this.make;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return this.model;
	}
	public void setYear(int year){
			this.year = year;
	}
	public int getYear(){
		return this.year;
	}

	public String toString(){
		return make + " " + model;
	}
	
	public void driveCar(Car c){
		System.out.println(c);
	}
}