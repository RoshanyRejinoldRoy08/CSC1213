import java.util.Scanner;
class Ex03{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		char control=' ';
		int sum=0;
		int count1=0;
		int count2=0;
		do
		{
		System.out.print("Enter the number to find the summation:");
		int n=sc.nextInt();
		sum=sum+n;
		
       if(n%2==0)
	   {
		   
		   count1=count1+1;
	
	   }
	   else
	   {
		    
		    count2=count2+1;
	   }
	   System.out.print("Do you want to continue(Y/N):");
		control = sc.next().charAt(0);
		}
      while(control=='Y');
		System.out.println("Summation is "+sum);
		System.out.println("Count the even number"+count1);
		System.out.println("Count the odd number"+count2);
		
		
	}
	
	}
