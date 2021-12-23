package org.newDay08.text;
import static java.lang.System.out;
import java.util.Scanner;

class ConcertInfo{
	public String name;
	String[] A={"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	String[] S={"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	String[] B={"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	ConcertInfo(){	}
	void set(String name) {
		this.name = name;
	}
	
}
class ConcertManager{
	public static final Scanner sc = new Scanner(System.in);
	public static final Scanner scN = new Scanner(System.in);
	ConcertInfo cInfo = new ConcertInfo();
	public void run() {
		while(true) {
			out.print("예약1, 조회2, 취소3, 끝내기4:>>");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				input();
				break;
			case 2:
				searchALL();
				break;
			case 3:
				cencel();
				break;
			case 4:
				out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				out.println("\n잘못입력하였습니다.");
					
			}
		}
	}
	private void cencel() {
		// TODO Auto-generated method stub
		String name;
		int seat,idx;
		out.print("좌석구분 S(1), A(2), B(3)>>");
		seat = sc.nextInt();
		switch(seat) {
		case 1:
			out.print("S>>");
			for(int i =0;i<cInfo.S.length;i++) {
				out.print(" "+cInfo.S[i]);
			}out.println();
			name = getName();
			idx = searchS(name);
			if(idx<0) out.println("예약 손님의 이름과 일치하지않습니다.");
			else {
				cInfo.S[idx]="---";
				out.println("<<예약최소를 완료했습니다.>>");
			}
			break;
		case 2:
			out.print("A>>");
			for(int i =0;i<cInfo.A.length;i++) {
				out.print(" "+cInfo.A[i]);
			}out.println();
			name = getName();
			idx = searchA(name);
			if(idx<0) out.println("예약 손님의 이름과 일치하지않습니다.");
			else {
				cInfo.A[idx]="---";
				out.println("<<예약최소를 완료했습니다.>>");
			}
			break;
		case 3:
			out.print("B>>");
			for(int i =0;i<cInfo.B.length;i++) {
				out.print(" "+cInfo.B[i]);
			}out.println();
			name = getName();
			idx = searchB(name);
			if(idx<0) out.println("예약 손님의 이름과 일치하지않습니다.");
			else {
				cInfo.B[idx]="---";
				out.println("<<예약최소를 완료했습니다.>>");
			}
			break;
		}
	}
	private int searchB(String name) {
		for(int i =0; i<10;i++) {
			if(cInfo.B[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}
	private int searchA(String name) {
		for(int i =0; i<10;i++) {
			if(cInfo.A[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}
	private int searchS(String name) {
		for(int i =0; i<10;i++) {
			if(cInfo.S[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}
	private void searchALL() {
		// TODO Auto-generated method stub
		out.print("S>>");
		for(int i =0;i<cInfo.S.length;i++) {
			out.print(" "+cInfo.S[i]);
		}
		out.println();
		out.print("A>>");
		for(int i =0;i<cInfo.A.length;i++) {
			out.print(" "+cInfo.A[i]);
		}
		out.println();
		out.print("B>>");
		for(int i =0;i<cInfo.B.length;i++) {
			out.print(" "+cInfo.B[i]);
		}
		out.println();
		
	}
	private void input() {
		// TODO Auto-generated method stub
		out.print("좌석구분 S(1), A(2), B(3)>>");
		int seat;
		String name;
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			out.print("S>> ");
			for(int i=0;i<cInfo.S.length;i++) {
				out.print(cInfo.S[i]+" ");
			}
			name = getName();
			seat = getNumber();
			if(cInfo.S[seat-1].equals("---"))
				cInfo.S[seat-1] = name;
			else out.println("이미 예약된 좌석입니다.");
			break;
		case 2:
			out.print("A>> ");
			for(int i=0;i<cInfo.A.length;i++) {
				out.print(cInfo.A[i]+" ");
			}
			name = getName();
			seat = getNumber();
			if(cInfo.A[seat-1].equals("---"))
				cInfo.A[seat-1] = name;
			else out.println("이미 예약된 좌석입니다.");
			break;
		case 3:
			out.print("B>> ");
			for(int i=0;i<cInfo.B.length;i++) {
				out.print(cInfo.B[i]+" ");
			}
			name = getName();
			seat = getNumber();
			if(cInfo.B[seat-1].equals("---"))
				cInfo.B[seat-1] = name;
			else out.println("이미 예약된 좌석입니다.");
			break;
		default:
				out.println("잘못된 입력입니다.");
				break;
		}
	}

	private String getName() {
		out.print("\n이름>>");
		String name = scN.nextLine();
		return name;
	}
	private int getNumber() {
		out.print("번호>>");
		int seat = sc.nextInt();
		return seat;
	}
	
	
}
public class staticEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcertManager cm = new ConcertManager();
		out.println("명품 콘서트홀 예약 시스템 입니다.");
		cm.run();
	}

}
