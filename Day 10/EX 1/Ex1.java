class Animal{
	public void animalSound(){
		System.out.println("The animal makes a sound");
	}
}
class Pig extends Animal{
	public void animalSound(){
		System.out.println("The pig says:wee wee");
	}
}
class Dog extends Animal{
	public void animalSound(){
		System.out.println("The dog says:bow bow");
	}
}
class Ex1{
	public static void main (String[]args){
		Animal myanimal=new Animal();
		Pig mypig =new Pig();
		Dog mydog =new Dog();
		
		myanimal.animalSound();
		mypig.animalSound();
		mydog.animalSound();
	}
}