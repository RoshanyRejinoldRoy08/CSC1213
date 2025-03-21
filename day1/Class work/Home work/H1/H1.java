class operators{
	public static void main(String[]args)
	{
		//Unary Operators
		int a=10;
		int b=10;
		
        System.out.println("Post-increment a++: " + (a++)); // Prints 10, then a becomes 11

        // Pre-increment: First increment, then use
        System.out.println("Pre-increment ++a: " + (++a)); // a becomes 12, then prints 12

        // Post-decrement: First use, then decrement
        System.out.println("Post-decrement b--: " + (b--)); // Prints 10, then b becomes 9

        // Pre-decrement: First decrement, then use
        System.out.println("Pre-decrement --b: " + (--b)); // b becomes 8, then prints 8
    

		
		//Logical Operators
		boolean N=true;
		boolean M=false;
		System.out.println("Logical 'AND': "+(N&&M));
		System.out.println("Logical 'OR': "+(N||M));
		System.out.println("Logical 'NOT': "+(!N));
		
		// Relational Operators
		int X=8,Y=15;
		System.out.println("Relational Greater than:"+(X>Y));
		System.out.println("Relational Less than:"+(X<Y));
		System.out.println("Relational Equals:"+(X==Y));
		System.out.println("Relational Not Equals:"+(X!=Y));
		
		//Assignment Operators
		int K=15;
		K+=6;
		System.out.println("Assignment Operator:"+K);
		
		//Terrory operators
		int i=10,j=40;
		int MaxVal=(i>j)?i:j;
		System.out.println("Terrory Operator :"+MaxVal);
	}
}