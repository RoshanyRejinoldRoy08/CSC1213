interface FirstInterface{
	public void myMethod();
}

interface SecondInterface{
	public void myOtherMethod();
}

class DemoClass implements FirstInterface,SecondInterface{
	public void myMethod(){
		System.out.println("Some text....");
	}
	public void myOtherMethod(){
		System.out.println("Some other text....");
	}
}

class Ex4{
	public static void main (String [] args)
	{
		DemoClass myObj = new DemoClass();
		
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}