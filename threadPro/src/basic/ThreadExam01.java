package basic;

/*
	문제: 쓰레드 프로그래밍을 구현하세요
	1~100까지 출력: DigitThread
	A~Z까지 출력하는 AlphaThread
	DigitThread와  AlphaThread를 동시에 실행: main

*/
class DigitThread extends Thread {
	public DigitThread(String name) {
		super(name);
	}

	// 1~100까지 출력
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(getName()+" "+i);
			try {
				Thread.sleep(100); // 실행흐름을 멈춘다
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

	// A~Z까지 출력
	public void run() {
		System.out.println("AlphaThread 작업 시작");
		//for (int i = 65; i <= 89; i++) {
		//System.out.println((char)i);
		//}
			for (char i = 'A'; i <= 'Z'; i++){
			System.out.println(getName()+" "+i);
			try {
				Thread.sleep(200); // 실행흐름을 멈춘다
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ThreadExam01 {

	public static void main(String[] args) {
		System.out.println("*******프로그램 main 시작********");
		DigitThread test1 = new DigitThread("test1");
		AlphaThread test2 = new AlphaThread("test2");
		test1.start();
		test2.start();
		
		
	}

}
