package org.Lirodek.ch05_5;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Toolkit;

public class MyFrame extends Frame{
	MyFrame(){}
	public MyFrame(String title, int width,int height) {
		//�ν��Ͻ� ����
		
		setTitle(title);
		super.setVisible(true);
		this.setSize(width, height);
		
		Toolkit tk = getToolkit().getDefaultToolkit();
		int sw = (int)tk.getScreenSize().getWidth();
		int sh = (int)(tk.getScreenSize().getHeight());
		setLocation(sw/2 - this.getWidth()/ 2,sh/2-this.getHeight()/2);
		
		super.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				MyFrame.this.dispose();
				System.exit(0);
				
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new MyFrame("��Ÿ�� �ʹ� ���̳�",600,400);
		//����� �ν��Ͻ� �ܺ�
		
	}

}
