package account;

public class Account{
	private double balance;
	
	protected void setBalance(double x){
		balance =x;
	}
		
	public Account(double balance)
	{
		this.balance=balance;
	}
		
	public void credit(double x){
		balance += x;
	};
		
	public void debit(double x){
		balance -= x;
	};
	
	public double getBalance(){
		return balance;
		
	}
	public void checkbalance(){
		System.out.printf("'s balance: $%1f\n",getBalance());
	};
	
		
}	

