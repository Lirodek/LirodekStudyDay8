package org.Lirodek.ch05;
class AAA{
	private int privateData;
	int defaultData;
	protected int protectedData;
	public int publicData;
}
class BBB extends AAA{
	public void set(){
//		privateData=10; �Ұ�
		defaultData =10;//����
		protectedData =10;//���� ��Ӿȹ����� �Ұ�
		publicData = 10;//����
	}
}
public class Ch05Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
