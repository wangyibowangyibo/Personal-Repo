
public class Driver2 {

	public static void main(String[] args) {
		
		//primitive types - variables
		//only stores one value at a time
		/*
		 * syntax:
		 * 		type name;
		 */
		int x; //declare a variable x to hold ints
		
		//assignment statement
		x = 13; 
		
		//print the value of x
		//		System.out.println(x);
		//		System.out.print(x);
		//		System.out.print(x);
		//		System.out.println(x);
		//		System.out.print(x);
		//		System.out.println(x);
		//		System.out.print(x);
		
		//declare AND assign
		int y = 5; //initializes the value at the same time
		
		//simple arithmetic in java
		System.out.println(x+y);
		System.out.println(x +"+"+ y); //String + number -> String
		
		//find product
		System.out.println(x*y);
		
		//x divided by y
		System.out.println(x/y);
		
		//remainder
		//What is remainder aftering dividing x by y?
		System.out.println(x%y);
		
		//x to the power of y
		//There is no simple operator for this one!!
		System.out.println(Math.pow(x,y) );
		
		//Decimal values?
		//double
		int 	myX = 3;
		double	myY = 3.5;
		
		//true or false values?
		//boolean
		boolean isFriday = true;
	}

}
