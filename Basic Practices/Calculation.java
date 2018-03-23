import java.util.Scanner;
class Execution{
	void add(Double num1, Double num2){
		System.out.println("Addition Total is : "+ (num1+num2));
	}
	void sub(Double num1, Double num2){
		System.out.println("Subtraction Total is : "+ (num1-num2));
	}
	void mult(Double num1, Double num2){
		System.out.println("Multiple Total is : "+ (num1*num2));
	}
	void divd (Double num1, Double num2){
		System.out.println("Division Total is : "+ (num1/num2));
	}
}

public class Calculation extends Execution{
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter username :");
		String name = scn.next();
		System.out.println("Enter First Number: ");
		Double num1 = scn.nextDouble();
		
		System.out.println("Enter Second Number: ");
		Double num2 = scn.nextDouble();
		
		
		//Execution ex = new Execution();
		//Calculation ex = new Calculation();
		Execution ex = new Calculation();
		System.out.println("Welcome to System Mr."+name);
		ex.add(num1,num2);
		ex.sub(num1,num2);
		ex.mult(num1,num2);
		ex.divd(num1,num2);
	}
}