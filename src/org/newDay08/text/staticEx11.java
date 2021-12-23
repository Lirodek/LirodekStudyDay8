package org.newDay08.text;
import static java.lang.System.out;
import java.util.Scanner;
class Add{
	private int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b =b;
	}
	void calculate() {
		out.println(a+b);
	}
}
class Sub{
	int a,b;
	void setValue(int a,int b){
		this.a = a;
		this.b =b;
	}
	void calculate() {
		out.println(a-b);
	}
	
}
class Mul{
	int a,b;
	void setValue(int a,int b){
		this.a = a;
		this.b =b;
	}
	void calculate() {
		out.println(a*b);
	}
}
class Div{
	int a,b;
	void setValue(int a,int b){
		this.a = a;
		this.b =b;
	}
	void calculate() {
		out.println(a/b);
	}
}
public class staticEx11 {
	public static final Scanner sc = new Scanner(System.in);
	public static final Scanner scN = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		out.print("두 정수와 연산자를 입력하세요>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String Operator = sc.next();
		switch(Operator) {
		case "+":
			add.setValue(a, b);
			add.calculate();
			break;
		case "-":
			sub.setValue(a, b);
			sub.calculate();
			break;
		case "*":
			mul.setValue(a, b);
			mul.calculate();
			break;
		case "/":
			div.setValue(a, b);
			div.calculate();
			break;
		default:
			out.println("잘못 입력하였습니다.");
			break;
		
		}
		
		
		

	}

}
