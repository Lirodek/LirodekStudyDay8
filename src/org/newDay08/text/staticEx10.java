package org.newDay08.text;

import java.util.Scanner;
import static java.lang.System.out;

class Dictionary{
	public static final Scanner sc3 =new Scanner(System.in);
	private static String[] kor = {"���","�Ʊ�","��","�̷�","���"};
	private static String[] eng = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		if(word.equals("�׸�")) System.exit(0);
		int idx= search2(word);
		if(idx<0) return word+"�� ���� ������ �����ϴ�.";
		else return kor[idx]+" "+eng[idx];
	}
	static int search2(String word) {
		for(int i=0;i<kor.length;i++) {
			if(kor[i].equals(word)||eng[i].equals(word)) {
				return i;
			}
		}
		return -1;
	}
	static void input() {
		out.print("�ѱ� �ܾ�?");
		String word = sc3.next();
		word =kor2Eng(word);
		out.print(word);
	}
	static void run() {
		out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			input();
			out.println();
		}
	}
}
public class staticEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary liv = new Dictionary();
		liv.run();
	}

}
