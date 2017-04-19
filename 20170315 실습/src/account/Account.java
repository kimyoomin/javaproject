package account;

public abstract class Account implements Valuable{
	private double balance;
	private String name;
	public int passMonth;
	
	public void setname(String name){
		this.name=name;
	}
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
		
	public void debit(double x) throws Exception{
		balance -= x;
	};
	
	public double getBalance(){
		return balance;
		
	}
	public void checkbalance(){
		System.out.printf("'s balance: $%1f\n",getBalance());
	};
	
	public abstract double getWithdrawableAmount();
	
	public abstract void passTime(int x);
	
	public abstract void passTime();
	
	

}