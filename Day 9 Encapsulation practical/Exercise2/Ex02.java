class Employee{
	private String name;
	private double salary;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
}

class Ex02{
	public static void main (String [] args)
	{
		Employee e1 = new Employee();
		
		e1.setName("Rose");
		System.out.println("Name is: "+e1.getName());
		
		e1.setSalary(25000.00);
		System.out.println("Salary is: "+e1.getSalary());
	}
}