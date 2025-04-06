import java.util.Scanner;
class Ex01{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number to find the summation:");
		int n = sc.nextInt();
		int sum=0;
		int i=1;
		
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.print("Summation of numbers from 0 to "+n+":"+sum);
	}
}
		