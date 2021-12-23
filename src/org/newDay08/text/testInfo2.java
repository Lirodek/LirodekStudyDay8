package org.newDay08.text;
import static java.lang.System.out;
import java.util.Scanner;

class Phone{
	String name, tell;
	Phone(String name, String tell){
		this.name = name;
		this.tell = tell;
	}
	
	public void showPhoe() {
		out.printf("%s�� ��ȣ�� %s �Դϴ�.\n",name,tell);
	}	
}
class PhoneBook{
	public static final Scanner sc = new Scanner(System.in);
	public static final Scanner scI = new Scanner(System.in);
	final int MAX = 100;
	int idx = 0;
	Phone[] P =  new Phone[MAX];
	public void input() {
		out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
		String name = sc.next();
		String phone = sc.next();
		P[idx++] = new Phone(name, phone);
	}
	int search(String name){
		for(int i=0;i<idx;i++) {
			if(P[i].name.equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public void searchData() {
		out.print("�˻��� �̸�>>");
		String name = sc.next();
		if(name.equals("�׸�")) System.exit(0);
		int idx1 = search(name);
		if(idx1<0) out.println(name+"�� �����ϴ�.");
		else P[idx1].showPhoe();
	}
	public void run() {
		out.print("�ο���>>");
		int choice = scI.nextInt();
		for(int i=0;i<choice;i++) {
			input();
		}
		while(true) {
			searchData();
		}
		
		
	}
	public void Menu() {
		
	}
}
//class PhoneBook{
//	
//}
public class testInfo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook ph = new PhoneBook();
		ph.run();
	}

}
