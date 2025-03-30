import java.util.Scanner;
 class NestedLoop{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num1 = sc.nextInt();
		System.out.print("Enter the number2:");
		int num2 = sc.nextInt();
		
		for(int i=1;i<num1;i++)
	{
		{
			System.out.println(i);
			
		}
		for (int j=1;j<num2;j++)
		{
			System.out.print(j+" ");
		}
	}
	}
 }