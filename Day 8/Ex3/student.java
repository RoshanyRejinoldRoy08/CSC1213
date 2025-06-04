class student{
	int id ;
	String name;
	public student (int x,String y){
		this.id=x;
		this.name=y;
	}
}
class Textstudent2{
	public static void main(String[]args){
		student s1=new student(101,"Rose");
		System.out.println(s1.id+" "+s1.name);
	}
}