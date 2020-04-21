package basic;

import java.io.IOException;
import java.nio.CharBuffer;

/*
	��Ƽ������ ���α׷���
	1. Runnable�������̽��� �����ϴ� Ŭ������ ����
	2. Runnable�������̽��� ������ �ִ� �߻�޼ҵ��� run�޼��带 �������̵�
		=> ���� �۾��ϰ� ���� ������ ����

*/
class RunnableDemo1 implements Runnable {
	// 1~100���� ���
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(
					Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(100); // �����帧�� �����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 5 == 0) { //5�� ����� �� ����
				System.out.println();
			}
		}
	}
}

public class RunnableTest01 {
	public static void main(String[] args) {
		System.out.println("*******���α׷� main ����********");
		RunnableDemo1 r1 = new RunnableDemo1();
		RunnableDemo1 r2 = new RunnableDemo1();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
