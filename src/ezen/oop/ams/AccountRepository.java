package ezen.oop.ams;
/**
 * 배열을 이용한 은행계좌 목록 저장 및 관리(검색, 수정, 삭제)
 * 
 * @author 임지연
 *
 */
public class AccountRepository {
	
	private Account[] accounts; // 계좌 담을 배열..
	private int count; //계좌 개수
	
	public AccountRepository() {
		this(10);
	};
	
	public AccountRepository(int capacity) { //생성자인데.. 배열 10개를 왜 만들었지?
		this.accounts = new Account[capacity]; // 메인에서 5 선언해서 계좌 5개 만들겠다 용도인듯
	}
	
	/**
	 * 신규 계좌 생성
	 * @param account 신규계좌
	 * @return 등록 여부
	 */
	public boolean addAccount(Account account) { //void 였는데 boolean으로 바꾼이유 : 정상 등록 됐다고 알려주려고.
//		데이터 검증이 필요하지만 편의상 생략
		accounts[count++] = account;
		return true;
	}
	
	
	/**
	 * 
	 * @return 전체계좌 목록
	 */
	public Account[] getAccounts() {
		return accounts;
	}
	
	/**
	 * 전체 계좌 목록 수 반환
	 * @return 목록 수
	 */
	public int getCount() {
		return count;
	}
	
	/**
	 * 계좌 번호 입력 받아서 계좌 반환
	 * @param accountNum 검색 계좌 번호
	 * @return 검색된 계좌
	 */
	public Account searchAccount(String accountNum) {
		for (int i = 0; i < count; i++) {
			if(accountNum.equals(accounts[i].getAccountNum())) {
				return accounts[i];
			}
		}
		return null;
		
	}
	
	/**
	 * 예금주명 입력 받아서 계좌 반환
	 * @param accountOwner 검색 예금주명
	 * @return 검색된 계좌목록
	 */
	public Account[] searchAccountByOwner(String accountOwner) {
		int index = 0;
		for (int i = 0; i < count; i++) {
			if(accountOwner.equals(accounts[i].getAccountOwner())) {
				index++;
			}
		}
		
		if(index==0) {
			return null;
		}
		
		Account array[] = new Account[index];
		int j=0;
		for (int i = 0; i < count; i++) {
			if(accountOwner.equals(accounts[i].getAccountOwner())) {
				array[j++] = accounts[i];
			}
		}
		return array;
	}
	
	
	/**
	 * 계좌 번호 입력 받아서 계좌 삭제   // 하나씩 밀라는거네
	 * @param accountNum 계좌 번호
	 * @return 성공 여부
	 */

public boolean removeAccount(String accountNum) {
		
		Account array[] = new Account[count];

		for (int i = 0; i < count; i++) {
			if(accountNum.equals(accounts[i].getAccountNum())) {
				for(int j=i; j<count; j++) {
				array[j] = accounts[j];
				accounts[j]= accounts[j+1];
				accounts[j+1]=array[j];
				//accounts[j]= accounts[j+1]; // 이거할 땐 count-1만큼 해야함
				}
				count--;
				return true;
			}
		}
		
		
		return false;
	}
	

	



}
