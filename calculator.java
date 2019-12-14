/*
	hi, today I am going to make a calculator with java code.
*/
public class calculator{
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("Welcome to java calculator, this calculator can do some easy calculation.");
		System.out.print("please enter first number:");
		double num1=s.nextDouble();
		System.out.print("please enter the symbol:");
		//Let do a test first.
		//there is soe wrong with it
		//we pass the test
		String symbol=s.next();
		//now Lets test again
		System.out.print("please enter second number:");
		double num2=s.nextDouble();
		double ans=0;
		switch(symbol){
			case "+":
			ans=num1+num2;
			break;
			case "-":
			ans=num1-num2;
			break;
			case "*":
			ans=num1*num2;
			break;
			case "/":
			ans=num1/num2;
			break;
			default:
			break;
			
		}
		
		//Let's test
		//There is some promble.
		//the prombles solved.
		//Let's finishing it
		System.out.println("The answer is: "+num1+symbol+num2+" = "+ans);
	}
	


}
