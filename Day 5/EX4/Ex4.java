import java.util.Scanner;
public class Ex4{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int[]number=new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the number");
			number[i]=ob.nextInt();
		}
		String[]days=new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		System.out.println(days[0]);
		System.out.println(days[1]);
		System.out.println(days[2]);
		System.out.println(days[3]);
		System.out.println(days[4]);
		System.out.println(days[5]);
		System.out.println(days[6]);
	}
}