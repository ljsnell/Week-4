	import java.util.Scanner;
	class ConditionalsExample {
	    static Scanner userinput = new Scanner(System.in);
		public static void main(String [] args) {
		//input the response to two questions
		boolean A,B;
		System.out.print("Do you own a pet?");
		A = userinput.nextBoolean();
		userinput.nextLine();
		
		System.out.print("Do you drive to school?");
		B = userinput.nextBoolean();
		userinput.nextLine();
		
		//a bunch of outputs based on answer to the questions
		if (A) {System.out.println("Your pet is hungry.  Please feed it.");}
		if (A && !B) {System.out.println("You can't have a pet in your dorm.");}
		if (B)  {System.out.println("You need to leave before 7:00 am.");}
		else {System.out.println("Have a nice walk to class.");}
		
		//numerical input
		double x;
		System.out.print("What is your favorite number?");
		x = userinput.nextDouble();
		userinput.nextLine();
		if (x<0) {System.out.println("How depressing.");}
			else if (x>1000) {System.out.println("Wow.  You like big numbers.");}
			else {System.out.println("I like that number too.");}
		if (Math.abs(x - 3.1415) < 0.001) {System.out.println("Do you want a slice?");}
		if (Math.round(x) != x) {System.out.println("You like fractional numbers. Nice.");}
	}
}
