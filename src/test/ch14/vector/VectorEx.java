package test.ch14.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
//		List<Board> list2 = new Vector<>(); //List는 vector의 부모 인터페이스(자동형변환)

//		Vector<Board> list = new Vector<>();
		ArrayList<Board> list = new ArrayList<>();
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				System.out.println("=============");
				System.out.println(getName());  
				for(int i=1; i<=10; i++) {
					list.add(new Board("제목" , "내용", "글쓴이"));
					System.out.println(i);
				}
				System.out.println("=============");
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				System.out.println("=============");
				System.out.println(getName());  
				for(int i=11; i<=20; i++) {
					list.add(new Board("제목" , "내용", "글쓴이"));					
					System.out.println(i);
				}
				System.out.println("=============");
				
			}
		};
		
		threadA.setName("threadA");
		threadB.setName("threadB");
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료 될 때까지 메인 스레드를 기다리게 하는 코드
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {
			
		}
		
		
		int size = list.size();
		System.out.println("총 객체 수:" + size);
		System.out.println();
		
	}
}
