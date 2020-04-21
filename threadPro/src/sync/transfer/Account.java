package sync.transfer;

public class Account extends Thread{
	private String accId;//���¹�ȣ
	private long balance;//�ܾ�
	private String ownerName;//������
	
	//������
	public Account(){
		
	}
	public Account(String accId, long balance, String ownerName) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	//�Ա��ϱ�
	public void deposit(long amount){
		balance = balance+amount;
	}
	//����ϱ�
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