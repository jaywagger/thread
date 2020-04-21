package basic;
class AlphaThread2 implements Runnable{
	public void run() {
		//1부터 20까지 출력하는 코드
		for (char c = 'A'; c <='Z'; c++) {
			System.out.print(c);
			try {
				Thread.sleep(500);//실행흐름을 멈춘다.
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class DigitThread2 implements Runnable{
	public void run() {
		//1부터 100까지 출력하는 코드
		for (int i = 1; i <=100; i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);//실행흐름을 멈춘다.
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}
}
public class RunnableTest02 {
	public static void main(String[] args) {
		System.out.println("main시작");
		//AlphaThread2 t1 = new AlphaThread2();
		
		new Thread(new AlphaThread2()).start();
		Thread thread2 = new Thread(new DigitThread2());
		//thread1.start();
		thread2.start();
		System.out.println("main종료");
	}
}










