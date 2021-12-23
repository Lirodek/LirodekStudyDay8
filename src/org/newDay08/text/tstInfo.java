
package org.newDay08.text;
import static java.lang.System.out;

import java.util.Scanner;
class Day{
	private String work;
	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	public void show() {
		if(work==null) System.out.println("�����ϴ�");
		else System.out.println(work+"�Դϴ�");
	}
}
class MonthSchedule{
	Day d = new Day();
	int day =0;
	int idx=0;
	public void input(){
		out.println("��¥(1~30)?");
		int day = MenuViewer.scI.nextInt();
		if(day>0||day<31) {
			this.day = day;
		}
		else {
			out.println("�߸� �Է��Ͽ����ϴ�.");
		}
		String work = MenuViewer.sc.next();
		d.setWork(work);
		
	}
	public void view() {
		out.print(day+"���� �� ���� ");
		d.show();
	}
	public void finish() {
		out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	public void run() {
		int choice;
		out.print("���� (�Է�:1, ����:2, ������:3)>>");
		choice = MenuViewer.scI.nextInt();
		
		switch(choice) {
		case 1:
			input();
			break;
		case 2:
			view();
			break;
		case 3:
			finish();
			break;
		default:
			out.println("�߸��� �Է��Դϴ�.");
			break;
		}
	}
}
class MenuViewer{
	static final Scanner sc = new Scanner(System.in);
	static final Scanner scI = new Scanner(System.in);
}
public class tstInfo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule MS = new MonthSchedule();
		while(true) {
			MS.run();
		}
	}

}