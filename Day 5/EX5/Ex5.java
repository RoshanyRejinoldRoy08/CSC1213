import java.util.Scanner;
public class Ex5{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int number[]=new int [5];
			
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter the number:");
			number[i]=ob.nextInt();
		}
		
			int largest =number[0];
			int small =number[0];

			for (int j=1;j<5;j++)
			{
				if(largest<number[j])
				{
					largest=number[j];
				}
			
			
			
				if(small>number[j])
				{
					small=number[j];
				}
			}
		
		System.out.println("The largest number:"+largest);
		System.out.println("The smallest number:"+small);
		
	}
}