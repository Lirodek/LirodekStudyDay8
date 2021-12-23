package org.Lirodek.ch05;
class AAA{
	private int privateData;
	int defaultData;
	protected int protectedData;
	public int publicData;
}
class BBB extends AAA{
	public void set(){
//		privateData=10; 불가
		defaultData =10;//가능
		protectedData =10;//가능 상속안받으면 불가
		publicData = 10;//ㄱㄴ
	}
}
public class Ch05Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
