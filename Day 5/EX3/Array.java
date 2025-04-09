import java.util.Scanner;
public class Array{
	public static void main(String args[])
	{
		Scanner ob =new Scanner (System.in);
		int[] number=new int[5];
		int sum=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the number");
			number[i]=ob.nextInt();
			sum=sum+number[i];
		}
		System.out.println("The summation of number"+sum);
	}
}