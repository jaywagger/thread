package sync.transfer;

public class Account extends Thread{
	private String accId;//계좌번호
	private long balance;//잔액
	private String ownerName;//예금주
	
	//생성자
	public Account(){
		
	}
	public Account(String accId, long balance, String ownerName) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	//입금하기
	public void deposit(long amount){
		balance = balance+amount;
	}
	//출금하기
	public void withdraw(long amount){
		balance = balance - amount;
	}
	//getter and setter
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}


	
}
