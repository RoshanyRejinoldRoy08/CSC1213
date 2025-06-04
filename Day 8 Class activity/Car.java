class Car{
	String brand;
	int year;
	
	Car(){
		 brand ="Toyota";
		 year=2020;
	}
	
	public int getAge(int currentYear){
		int age=currentYear-year;
		return age;
	}
	
	public void displayInfo(int currentYear){
		int age=currentYear-year;
		System.out.println("Brand: "+brand+" year:"+year);
		System.out.println("My "+brand+" is "+age+" years old");
	}
	
	public static void main(String[]args){
		Car ca1=new Car();
		Car ca2=new Car();
		Car ca3=new Car();
		
		ca1.brand="Toyota";
		ca1.year=2020;
		
		ca2.brand="Audi A4";
		ca2.year=2021;
		
		ca3.brand="BMW";
		ca3.year=2022;
		
		ca1.getAge(2025);
		
		ca1.displayInfo(2025);
		ca2.displayInfo(2025);
		ca3.displayInfo(2025);
	}
}