package test.ch06.question.last;

import java.util.Scanner;

public class BankApplication {
	private static Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) createAccount();
			else if (selectNo == 2) accountList();
			else if (selectNo == 3) deposit();
			else if (selectNo == 4) withdraw();
		}  
			
	}
	
	//static이 있어야 main 메소드에서 바로 호출 가능 
	//1. 계좌 생성
	public static void createAccount() {}
	
	//2. 계좌 목록
	public static void accountList() {}
	
	//3. 예금
	public static void deposit() {}
	
	//4. 출금
	public static void withdraw() {}
	
}
