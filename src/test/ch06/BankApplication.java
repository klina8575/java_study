package test.ch06;

import java.util.Scanner;

public class BankApplication {

	static Account[] accountArray = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("-------------------------");
			System.out.println("선택> ");
		int selectNumber = scanner.nextInt();
		
		switch (selectNumber) {
		case 1: createAccount(); break;
		case 2: accountList(); break;
//		case 3: deposit(); break;
//		case 4: withdraw(); break;
		case 5: run = false; break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	//계좌생성
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.println("계좌번호: ");
		String accNum = scanner.next();
		System.out.println("--------");
		System.out.println("계좌주:");
		String accOwner = scanner.next();
		System.out.println("--------");
		System.out.println("입금초기액:");
		int accMoney = scanner.nextInt();
		
		Account newAccount = new Account(accNum, accOwner, accMoney);
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다");
				break;
			} 	
		}
		
		System.out.println(newAccount.getAccNum() + "," + newAccount.getAccOwner() + "," + newAccount.getAccMoney());
	}
	
	//계좌 목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
//		System.out.println(Arrays.toString(accountArray));
		for (int i = 0; i< accountArray.length; i++) {
//			accountArray[i];
			System.out.println(accountArray[i].getAccNum() + "," + accountArray[i].getAccOwner() + "," + accountArray[i].getAccMoney());
//			System.out.println(account);
//			if (account != null) {
//				System.out.print(account.getAccNum());
//				System.out.print(" ");
//				System.out.print(account.getAccOwner());
//				System.out.print(" ");
//				System.out.print(account.getAccMoney());
//				System.out.print(" ");
//			}
		}
		
	}
	
	
	//예금
//	private static void deposit() {
//		System.out.println("--------------");
//		System.out.println("예금");
//		System.out.println("--------------");
//		System.out.print("계좌번호: ");
//		String accNum = scanner.next();
//		System.out.println("예금액: ");
//		int plusMoney = scanner.nextInt();
//				
//		Account account = findAccount(accNum);
//		if (account == null) {
//			System.out.println("결과: 계좌가 없습니다.");
//			return;
//		}
//		account.setAccMoney(account.getAccMoney() + plusMoney);
//		System.out.println("결과: 예금이 성공되었습니다");
//		
//		
//	}
//	
//	//출금
//	private static void withdraw() {
//			System.out.println("--------------");
//			System.out.println("출금");
//			System.out.println("--------------");
//			System.out.print("계좌번호:2 ");
//			String accNum = scanner.next();
//			System.out.println("출금액: ");
//			int minusMoney = scanner.nextInt();
//					
//			Account account = findAccount(accNum);
//			if (account == null) {
//				System.out.println("결과: 계좌가 없습니다.");
//				return;
//			}
//			account.setAccMoney(account.getAccMoney() - minusMoney);
//			System.out.println("결과: 출금이 성공되었습니다");
//		}	
//	private static Account findAccount(String accNum) {
//		for (int i = 0; i < accountArray.length; i++) {
//			if (accountArray[i] == null) {
//				break;
//			}
//			if (accountArray[i].getAccNum().equals(accNum)) {
//				return accountArray[i];
//			}
//		}
//		return null;
//	}

}
