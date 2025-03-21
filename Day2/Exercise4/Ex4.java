import java.util.Scanner;
class StudentDetails{
	public static void main(String[] args){
		String fullname;
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your FullName:");
	fullname = sc.nextLine();
	
	System.out.println("Enter the Your Registration Number");
	String RegNo=sc.next();
	
	System.out.println("Enter the your age:");
	int Age=sc.nextInt();
	
	System.out.println("Enter the Sex (M/F)");
	char Sex=sc.next().charAt(0);
	
	System.out.println("Enter the your mobile number:");
	long phoneNo=sc.nextLong();
	
	System.out.println("Enter the your GPA:");
	double gpa=sc.nextDouble();
	
	System.out.println("Fullnacme:"+fullname+"\n"+"Registration number:"+RegNo+"\n"+"Age"+Age+"\n"+"Sex"+Sex+"\n"+"PhoneNo:"+phoneNo+"\n"+"GPA"+gpa);
	}
}
