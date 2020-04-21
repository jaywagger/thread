package basic;

/*
	����: ������ ���α׷����� �����ϼ���
	1~100���� ���: DigitThread
	A~Z���� ����ϴ� AlphaThread
	DigitThread��  AlphaThread�� ���ÿ� ����: main

*/
class DigitThread extends Thread {
	public DigitThread(String name) {
		super(name);
	}

	// 1~100���� ���
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(getName()+" "+i);
			try {
				Thread.sleep(100); // �����帧�� �����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}

}

class AlphaThread extends Thread {
	public AlphaThread(String name) {
		super(name);
	}

	// A~Z���� ���
	public void run() {
		System.out.println("AlphaThread �۾� ����");
		//for (int i = 65; i <= 89; i++) {
		//System.out.println((char)i);
		//}
			for (char i = 'A'; i <= 'Z'; i++){
			System.out.println(getName()+" "+i);
			try {
				Thread.sleep(200); // �����帧�� �����
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ThreadExam01 {

	public static void main(String[] args) {
		System.out.println("*******���α׷� main ����********");
		DigitThread test1 = new DigitThread("test1");
		AlphaThread test2 = new AlphaThread("test2");
		test1.start();
		test2.start();
		
		
	}

}