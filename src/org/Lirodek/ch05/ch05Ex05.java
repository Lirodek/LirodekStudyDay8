
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
		out.printf("People [����:%s, ����:%d, ����:%s]",name,age,job);
	}
}
public class ch05Ex05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People1 p1 = new People1("ȫ�浿",23,"����ĳ�⸶����");//�̸� ���� ����
		p1.showInfo();// p1�� information
		People1 p2 = new People1();
		out.println();
		p2.setInfo("�̼���",35,"���");
		p2.showInfo();
		
	}

}