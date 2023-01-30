package week2.day1;

public class CalculatorAssignment {
public void add() {
	int a=2;
	int b=3;
	int c=a+b;
	System.out.println("Addition of two numbers is"+ c);
}
public void sub(){
	int a=2;
	int b=3;
	int d=a-b;
	System.out.println("Subtraction of two numbers is"+ d);
}
public void mul() {
	int a=2;
	int b=3;
	int e=a*b;
	System.out.println("Multiplication of two numbers is"+ e);
}

public void div() {
	int a=2;
	int b=3;
	int f=a/b;
	System.out.println("Division of two numbers is"+ f);
}
public static void main(String[] args) {
	CalculatorAssignment Calc= new CalculatorAssignment();
	Calc.add();
	Calc.sub();
	Calc.mul();
	Calc.div();
}
}