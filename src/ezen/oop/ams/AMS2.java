package ezen.oop.ams;

import java.util.Scanner;

public class AMS2 {

	private static AccountRepository repository = new AccountRepository();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("*****************************************");
		System.out.println("** " + Account.BANK_NAME + "은행 계좌 관리 애플리케이션 **");
		System.out.println("*****************************************");

		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.입금|4.출금|5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				// 계좌 생성 및 등록
				createAccount();
			} else if (selectNo == 2) {
				// 계좌목록
				System.out.println("----------전체 계좌 목록------------");
				System.out.println("번호    이름   비밀번호  잔액  대출금");
				for (int i = 0; i < repository.getCount(); i++) {
					if(repository.getAccounts()[i] instanceof MinusAccount) { //instanceof의 활용..
						System.out.println("마이너스 통장\t"+repository.getAccounts()[i]);
					} else {
						System.out.println("입출금 통장\t"+repository.getAccounts()[i]);
					}
				}
			} else if (selectNo == 3) {
				// 입금
				depositAccount();

			} else if (selectNo == 4) {
				// 출금
				withdrawAccount();
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		scanner.close();
		System.out.println("계좌관리 애플리케이션을 종료합니다.");
	}

	/**
	 * 키보드(표준입력)로부터 계좌정보 입력 받아 계좌생성하기
	 */
	private static void createAccount() {
		System.out.print("어떤 통장을 만드시겠습니까? \n1.입출금 통장 2.마이너스 통장 :");
		int num = Integer.parseInt(scanner.nextLine());
		if(num==1) {
			System.out.println("입출금 통장을 선택하셨습니다.");	
			System.out.print("예금주명: ");
			String owner = scanner.nextLine();
	
			System.out.print("비밀번호: ");
			int passwd = Integer.parseInt(scanner.nextLine());
	
			System.out.print("입금액: ");
			long inputMoney = Long.parseLong(scanner.nextLine());
	
			Account account = new Account(owner, passwd, inputMoney);
			
			// AccountRepository에 계좌등록
			repository.addAccount(account);
		}
		else if(num==2) {
			System.out.println("마이너스 통장을 선택하셨습니다.");	
			System.out.print("예금주명: ");
			String owner = scanner.nextLine();
	
			System.out.print("비밀번호: ");
			int passwd = Integer.parseInt(scanner.nextLine());
	
			System.out.print("입금액: ");
			long inputMoney = Long.parseLong(scanner.nextLine());
			
			System.out.print("대출액: ");
			long borrowMoney = Long.parseLong(scanner.nextLine());
	
			Account account = new MinusAccount(owner, passwd, inputMoney, borrowMoney);
	
			// AccountRepository에 계좌등록
			repository.addAccount(account);
			System.out.println("※ 계좌 정상 등록 처리되었습니다.");
		}
		else {
			System.out.println("잘못 입력했습니다. 시스템을 종료합니다.");
			return;
		}
	}

	private static void depositAccount() {
		System.out.print("입급 할 계좌: ");
		String accountNum = scanner.nextLine();
		System.out.print("입금액: ");
		long inputMoney = Long.parseLong(scanner.nextLine());
		
		
		for (int i = 0; i < repository.getCount(); i++) {
			if (accountNum.equals(repository.getAccounts()[i].getAccountNum())) {
				repository.getAccounts()[i].deposit(inputMoney);
				System.out.println("입금 후 금액: "+repository.getAccounts()[i].getRestMoney());
				return;
			}
		} System.out.println("일치하는 계좌가 없습니다.");
	}
	
	
	private static void withdrawAccount() {
		System.out.print("출금 할 계좌: ");
		String accountNum = scanner.nextLine();
		System.out.print("출금액: ");
		long outputMoney = Long.parseLong(scanner.nextLine());
		
		for (int i = 0; i < repository.getCount(); i++) {
			if (accountNum.equals(repository.getAccounts()[i].getAccountNum())) {
				if(repository.getAccounts()[i].getRestMoney()<outputMoney) {
					System.out.println("출금할 잔액이 부족합니다.");
					return;
				}
				repository.getAccounts()[i].withdraw(outputMoney);
				System.out.println("출금 후 금액: "+repository.getAccounts()[i].getRestMoney());
				return;
			}
		} System.out.println("일치하는 계좌가 없습니다.");
	}

}
