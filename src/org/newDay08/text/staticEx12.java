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
			out.print("����1, ��ȸ2, ���3, ������4:>>");
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
				out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			default:
				out.println("\n�߸��Է��Ͽ����ϴ�.");
					
			}
		}
	}
	private void cencel() {
		// TODO Auto-generated method stub
		String name;
		int seat,idx;
		out.print("�¼����� S(1), A(2), B(3)>>");
		seat = sc.nextInt();
		switch(seat) {
		case 1:
			out.print("S>>");
			for(int i =0;i<cInfo.S.length;i++) {
				out.print(" "+cInfo.S[i]);
			}out.println();
			name = getName();
			idx = searchS(name);
			if(idx<0) out.println("���� �մ��� �̸��� ��ġ�����ʽ��ϴ�.");
			else {
				cInfo.S[idx]="---";
				out.println("<<�����ּҸ� �Ϸ��߽��ϴ�.>>");
			}
			break;
		case 2:
			out.print("A>>");
			for(int i =0;i<cInfo.A.length;i++) {
				out.print(" "+cInfo.A[i]);
			}out.println();
			name = getName();
			idx = searchA(name);
			if(idx<0) out.println("���� �մ��� �̸��� ��ġ�����ʽ��ϴ�.");
			else {
				cInfo.A[idx]="---";
				out.println("<<�����ּҸ� �Ϸ��߽��ϴ�.>>");
			}
			break;
		case 3:
			out.print("B>>");
			for(int i =0;i<cInfo.B.length;i++) {
				out.print(" "+cInfo.B[i]);
			}out.println();
			name = getName();
			idx = searchB(name);
			if(idx<0) out.println("���� �մ��� �̸��� ��ġ�����ʽ��ϴ�.");
			else {
				cInfo.B[idx]="---";
				out.println("<<�����ּҸ� �Ϸ��߽��ϴ�.>>");
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
		out.print("�¼����� S(1), A(2), B(3)>>");
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
			else out.println("�̹� ����� �¼��Դϴ�.");
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
			else out.println("�̹� ����� �¼��Դϴ�.");
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
			else out.println("�̹� ����� �¼��Դϴ�.");
			break;
		default:
				out.println("�߸��� �Է��Դϴ�.");
				break;
		}
	}

	private String getName() {
		out.print("\n�̸�>>");
		String name = scN.nextLine();
		return name;
	}
	private int getNumber() {
		out.print("��ȣ>>");
		int seat = sc.nextInt();
		return seat;
	}
	
	
}
public class staticEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcertManager cm = new ConcertManager();
		out.println("��ǰ �ܼ�ƮȦ ���� �ý��� �Դϴ�.");
		cm.run();
	}

}
