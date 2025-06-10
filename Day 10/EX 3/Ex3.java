interface Animal{
	public void animalSound();
	public void sleep();
}

class Pig implements Animal{
	public void animalSound(){
		System.out.println("The pig says: Wee Wee");
	}
	public void sleep(){
		System.out.println("Zzz");
	}
}

class Ex3{
	public static void main (String [] args)
	{
		Pig P1 = new Pig();
		
		P1.animalSound();
		P1.sleep();
	}
}