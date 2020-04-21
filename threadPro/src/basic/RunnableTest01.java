package basic;

import java.io.IOException;
import java.nio.CharBuffer;

/*
	멀티쓰레드 프로그래밍
	1. Runnable인터페이스를 구현하는 클래스를 생성
	2. Runnable인터페이스가 가지고 있는 추상메소드인 run메서드를 오버라이딩
		=> 동시 작업하고 싶은 내용을 정의

*/
class RunnableDemo1 implements Runnable {
	// 1~100까지 출력
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(
					Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(100); // 실행흐름을 멈춘다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 5 == 0) { //5의 배수일 때 띄어쓰기
				System.out.println();
			}
		}
	}
}

public class RunnableTest01 {
	public static void main(String[] args) {
		System.out.println("*******프로그램 main 시작********");
		RunnableDemo1 r1 = new RunnableDemo1();
		RunnableDemo1 r2 = new RunnableDemo1();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
