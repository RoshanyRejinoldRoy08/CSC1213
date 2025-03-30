import java.util.Scanner;
class Ex1{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		if (num>0)
		{
			System.out.print("It is a positive number.");
		}
		else if(num<0)
		{
			System.out.print("It is a negative number.");
		}
		else{
			System.out.print("It is zero.");
		}
	}
}
