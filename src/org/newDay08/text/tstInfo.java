
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
		if(work==null) System.out.println("없습니다");
		else System.out.println(work+"입니다");
	}
}
class MonthSchedule{
	Day d = new Day();
	int day =0;
	int idx=0;
	public void input(){
		out.println("날짜(1~30)?");
		int day = MenuViewer.scI.nextInt();
		if(day>0||day<31) {
			this.day = day;
		}
		else {
			out.println("잘못 입력하였습니다.");
		}
		String work = MenuViewer.sc.next();
		d.setWork(work);
		
	}
	public void view() {
		out.print(day+"일의 할 일은 ");
		d.show();
	}
	public void finish() {
		out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	public void run() {
		int choice;
		out.print("할일 (입력:1, 보기:2, 끝내기:3)>>");
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
			out.println("잘못된 입력입니다.");
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