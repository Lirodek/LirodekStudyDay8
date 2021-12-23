package org.Lirodek.ch05_5;

import java.awt.Button;
import java.awt.Frame;

public class Ch05Ex01 extends MyFrame{
	Button okBtn = new Button("Ok");
	public Ch05Ex01() {
		//MyFrame 의 인자있는 생성자를 명시적으로 호출한다.
		this("짱구는 못말려",300,200);
	}
	public Ch05Ex01(String title, int w, int h) {
		// TODO Auto-generated constructor stub
		super(title,w,h);
	}
	public static void main(String[] args) {
		new Ch05Ex01();
	}
}
