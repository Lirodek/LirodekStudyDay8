package org.newDay08.text;

import static java.lang.System.out;
import java.util.Scanner;
class Player{
	String name;
	public Player(String name) {
		this.name = name;
	}
}
class GameApp{
	static final Scanner sc = new Scanner(System.in);
	static final Scanner scw = new Scanner(System.in);
	final int MAX=100;
	String word="�ƹ���";
	int lastIndex = word.length()-1;
	char lastChar = word.charAt(lastIndex);
	char firstChar = word.charAt(0);
	Player[] play = new Player[MAX];
	int cnt=0;
	public void MakePlayer() {
		out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int people = sc.nextInt();
		
	}
	public void run() {
		out.println("�����ձ� ������ �����մϴ�...");
		while(true) {
			
		}
	}
}
public class WordGameApp {
	public static void main(String[] args) {
		
	}
}
