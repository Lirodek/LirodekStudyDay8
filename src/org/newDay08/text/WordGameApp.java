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
	String word="아버지";
	int lastIndex = word.length()-1;
	char lastChar = word.charAt(lastIndex);
	char firstChar = word.charAt(0);
	Player[] play = new Player[MAX];
	int cnt=0;
	public void MakePlayer() {
		out.print("게임에 참가하는 인원은 몇명입니까>>");
		int people = sc.nextInt();
		
	}
	public void run() {
		out.println("끝말잇기 게임을 시작합니다...");
		while(true) {
			
		}
	}
}
public class WordGameApp {
	public static void main(String[] args) {
		
	}
}
