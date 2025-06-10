class Calculator{
	
	int add(int a, int b){
		return a+b;
	}
	
	private int multiply(int a, int b){
		return a*b;
	}
	
	static int subtract(int a, int b){
		return a-b;
	}
	
	public void calling(){
		System.out.println(multiply(5,6));
	}
	
	final double pi = 3.14;
}
class cal extends Calculator{
	int add(int a, int b){
		return a+b;
	}
}

abstract class Shape{
	abstract double area();
}

class Circle extends Shape{
	double area(){
		return 2*3.14*5;
	}
}

class Rectangle extends Shape{
	double area(){
		return 5.4*6.3;
	}
}

class Ex01{
	public static void main (String [] args)
	{
		cal c1 = new cal();
		Circle s1 = new Circle();
		Rectangle s2 = new Rectangle();
		
		System.out.println(c1.add(5,6));
		c1.calling();
		System.out.println(c1.subtract(10,6));
		System.out.println(s1.area());
		System.out.println(s2.area());
	}
}