package org.Lirodek.ch04;
import static java.lang.System.out;

class Car{
	private int gauge;
	private String model;
	void set(int gauge,String model) {
		this.gauge =gauge;
		this.model = model;
	}
	public String getModel() {return model;}
	public int getGauge() {return gauge;}
	void carViewer() {
		out.print("������ "+getModel()+" ���� �ִ� �ӷ��� "+getGauge());
	}
}
class MyCar extends Car{
	private String Color;

	public String getColor() {
		return Color;
	}

	public void set(int gauge, String model, String color) {
		super.set(gauge, model);
		this.Color = color;
	}
	public void carViewer() {
		super.carViewer();
		out.print(" ������ "+Color+"��");
	}

}
public class extendsreview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car oC = new Car();
		oC.set(180, "������");
		oC.carViewer();
		out.println();
		MyCar oC1 = new MyCar();
		oC1.set(220, "����","�Ķ�");
		oC1.carViewer();
	}

}
