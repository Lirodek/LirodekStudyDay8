package org.Lirodek.ch05;

import static java.lang.System.out;
//1개의 자바 파일에 여러 클래스 선언가능 pakage member

class Point{
	private int x, y;
	void set(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	void showPoint() {
		out.print("("+x+","+y+")\n");
	}
}
//Point를 확장한ColorPoint 클래스 선언
//class 서브 클래스명 extends 슈퍼 클래스명{}
//서브 클래스의 내용에 슈퍼 클래스의 내용이 포함된다는 의미.
class ColorPoint extends Point{
	String color;
	void setColor(String color){
		this.color = color;
	}
	public void showColorPoint() {
		
		out.print(color);
		super.showPoint();
	}
}
class Point3D extends Point{
	private int z;
	void set(int x, int y, int z) {
		super.set(x, y);
		this.z = z;
	}
	void show3DPoint() {
		out.printf("%d",z);
		super.showPoint();
		
	}
}
public class Ch05Ex01 {
	public static void main(String[] args) {
		//point를 확장한 point 3D 클래스를 선언하고 사용하자.
		Point3D p3D = new Point3D();
		p3D.set(10,20,15);
		p3D.show3DPoint();
		
	}
	public static void main01(String[] args) {
		ColorPoint cp = new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
	}
	public static void main00(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.set(1,2);
		p.showPoint();
	}

}
