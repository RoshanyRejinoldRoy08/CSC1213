import java.util.Scanner;
class Ex6{
	public static void main(String[]args){
		Scanner ob =new Scanner(System.in);
		System.out.print("Enter the size of row:");
		int r=ob.nextInt();
		System.out.print("Enter the size of column:");
		int c=ob.nextInt();
		
		
		int number[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("Enter the element:");
				number[i][j]=ob.nextInt();
			}
		}
		
		
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int sum=0;
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				sum=sum+number[i][j];
			}
			
		}
		
		
		int max=number[0][0];
		for(int i=0;i<r;i++)
		{
			
			for(int j=0;j<c;j++)
			{
				if(number[i][j]>max)
				{
					max=number[i][j];
				}
			}
			
	
		}
		
		System.out.println("sum is : "+sum);
		System.out.println("Max of number:"+max);
	}  	
}