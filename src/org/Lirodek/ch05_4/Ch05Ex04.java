package org.Lirodek.ch05_4;
import static java.lang.System.out;
import java.util.Scanner;
class Person{
	public Person() {}
	public Person(String name) {
		out.println(">>>1.����� ������ ȣ��!"+name);
	}
	
}
class Student extends Person{
	public Student() {
		//�θ��� ����Ʈ ������ paramater ���� ������ �ڵ����� ȣ��ȴ�
		//���� �θ��� ����Ʈ �����ڰ� ���ٸ� ���������� �Ű����� �ִ� �����ڸ� ȣ���ؾ��Ѵ�.asdㅁㄴㅇ
		super("no name");
		out.println("�л��� ������ ȣ��");
	}
}
class WorkStudent extends Student{
	public WorkStudent() {
		out.println("�л��� ������ ȣ��");
	}
}
public class Ch05Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
