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
		out.printf("%s의 번호는 %s 입니다.\n",name,tell);
	}	
}
class PhoneBook{
	public static final Scanner sc = new Scanner(System.in);
	public static final Scanner scI = new Scanner(System.in);
	final int MAX = 100;
	int idx = 0;
	Phone[] P =  new Phone[MAX];
	public void input() {
		out.print("이름관 전화번호(이름과 번호는 빈 칸없이 입력)>>");
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
		out.print("검색할 이름>>");
		String name = sc.next();
		if(name.equals("그만")) System.exit(0);
		int idx1 = search(name);
		if(idx1<0) out.println(name+"이 없습니다.");
		else P[idx1].showPhoe();
	}
	public void run() {
		out.print("인원수>>");
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
