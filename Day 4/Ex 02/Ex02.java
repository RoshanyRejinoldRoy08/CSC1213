import java.util.Scanner;
class Ex02{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		char control=' ';
		int sum=0;
		do
		{
		System.out.print("Enter the number to find the summation:");
		int n=sc.nextInt();
		
		sum=sum+n;
		System.out.print("Do you want to continue(Y/N):");
		control = sc.next().charAt(0);
		}
		while(control=='Y');

		System.out.print("Summation of number:"+sum);
	}
}