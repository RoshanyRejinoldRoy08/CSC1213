import java.util.Scanner;
class vowel{
	public static void main(String []args)
	{
		Scanner op=new Scanner(System.in);
		System.out.print("Enter the character:");
		char letter =op.next().charAt(0);
		
		switch(letter)
		{
		case 'A': case 'a': case 'E': case 'e' : case 'i': case 'I': case 'o': case 'O': case 'U': case 'u':
		System.out.print ("It is a vowel letter");
		break;
		default :System.out.print("It is not a vowel letter ");
		}
	}
}