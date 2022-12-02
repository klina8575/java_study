package test.ch13.multiThread;

import java.awt.Toolkit;

public class ThreadNameEx {

	public static void main(String[] args) {
		//main 쓰레드 이름 가져오기
		Thread mainThread = Thread.currentThread(); //main 쓰레드를 얻어온다.
		System.out.println(mainThread.getName() + "실행");
		
		//쓰레드 3개 생성
		for (int i=0; i<3; i++) {			
			Thread threadA = new Thread() { //상속 + 클래스 만드는걸 동시에
				@Override
				public void run() {
					System.out.println(getName() + "실행"); //쓰레드 이름을 가져온다.
				}
			};
			
			threadA.start();
		}
		
		//chat쓰레드 생성
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행"); //쓰레드 이름을 가져온다.
			}
		};
		
		chatThread.setName("chat-thread"); // 쓰레드가 실행되기 전에 이름을 바꾼다.
		chatThread.start();
		
	}
		
}


