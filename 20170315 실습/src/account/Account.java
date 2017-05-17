package account;

import java.util.ArrayList;

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
	
	public static double sumForAccount(ArrayList <? extends Account > list){
		double sum=0;
		for(Account account : list){
			sum+=account.getBalance();
		}
		return sum;
	}
	
	public static void passTimeForList(ArrayList <? extends Account > list,int month){
		for(Account account : list){
			account.passTime(month);
		}
	}
	
	public abstract double getWithdrawableAmount();
	
	public abstract void passTime(int x);
	
	public abstract void passTime();
	
	

}