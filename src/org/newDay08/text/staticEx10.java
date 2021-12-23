package org.newDay08.text;

import java.util.Scanner;
import static java.lang.System.out;

class Dictionary{
	public static final Scanner sc3 =new Scanner(System.in);
	private static String[] kor = {"사랑","아기","돈","미래","희망"};
	private static String[] eng = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		if(word.equals("그만")) System.exit(0);
		int idx= search2(word);
		if(idx<0) return word+"는 저의 사전에 없습니다.";
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
		out.print("한글 단어?");
		String word = sc3.next();
		word =kor2Eng(word);
		out.print(word);
	}
	static void run() {
		out.println("한영 단어 검색 프로그램입니다.");
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
