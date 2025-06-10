class person{
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		this.name=newName;
	}
}
public class main{
	public static void main(String[]args){
		person obj=new person();
		obj.setName("Rose");
		System.out.println(obj.getName());
	}
}
	