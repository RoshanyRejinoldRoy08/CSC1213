abstract class Animal{
	public abstract void animalSound();
	public void sleep(){
		System.out.println("Zzz");
	}
}

class Pig extends Animal{
	public void animalSound(){
		System.out.println("The pig says: Wee Wee");
	}
}

class Ex2{
	public static void main (String [] args)
	{
		Animal P1 = new Pig();
		
		P1.sleep();
		P1.animalSound();
	}
}