
public class typecastingproject {

	public static void main(String[] args) {
		// implicit conversion ( Widening typecasting )
		//convert int into double type
		    System.out.println("Implicit type catsing "); 
		    
		    int num1 = 25;
		    System.out.println("The integer value: " + num1);

		    
		    double data1 = num1;
		    System.out.println("The double value: " + data1);

		// explicit conversion ( Narrowing typecasting )
		//convert double into int type
		    System.out.println("\n " );
		    System.out.println("Explicit type casting ");
		    double num2 = 18.99;
		    System.out.println("The double value: " + num2);

		    int data2 = (int)num2;
		    System.out.println("The integer value: " + data2);

	}

}
