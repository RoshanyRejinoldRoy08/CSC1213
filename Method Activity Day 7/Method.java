public class Method{
	// Greet a user by name
	static void greetUser(String name){
		System.out.println("Hello," +name+ "! Welcome");
	}
	
	
	//calculate and return the cube of a number
	static int cube(int num){
		return num*num*num;
	}
	
	
	//check voting eligibility
	static void checkVotingEligibility (int age){
		if(age >18){
			System.out.println("Eligible to vote");
		}
		else{
			System.out.println(" Not Eligible");
		}
	}
	
	
	//find factorial
	static int factorial (int number){
		int fact =1;
		for(int i=1; i<=number; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	
	//overload a greeting method
	static void greet(String name){
		System.out.println("Hi,"+name+"!");
	}
	static void greet(String name,int age){
		System.out.println("Hi,"+name+"! You are "+age+" years old.");
	}
	
	//Return the average of three numbers
	static double numbers(double a,double b,double c){
		return  (a+b+c)/3.0;
	}
	
	
	public static void main(String []args){
		greetUser("Rose");
		
		int result=cube(3);
		System.out.println("cube:"+result);
		
		checkVotingEligibility(20);
		
		System.out.println ("Factorial is :" +factorial(5));
		
		greet("Rose");
		greet("Rose",21);
		
		double average = numbers(2,6,9);
		System.out.println("Average is "+average);

	}
}
		