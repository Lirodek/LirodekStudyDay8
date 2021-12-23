
package org.Lirodek.ch05;

import static java.lang.System.out;

class People1{
	private String name, job;
	private int age;
	public People1() {}
	public People1(String name, int age, String job){
		this.name =name;
		this.age = age;
		this.job = job;
	}
	public void setInfo(String name, int age, String job) {
		this.name =name;
		this.age = age;
		this.job = job;
	}
	void showInfo(){
		out.printf("People [성명:%s, 나이:%d, 직업:%s]",name,age,job);
	}
}
public class ch05Ex05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People1 p1 = new People1("홍길동",23,"더덕캐기마스터");//이름 나이 직업
		p1.showInfo();// p1의 information
		People1 p2 = new People1();
		out.println();
		p2.setInfo("이순신",35,"당근");
		p2.showInfo();
		
	}

}