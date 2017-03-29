package account;

public class CheckingAccount extends Account {
	
	private double creditLimit;
	private double interest;
	private double loan_interest;

	public CheckingAccount(double balance, double creditLimit,double interest, double loan_interest){
		super(balance);
		this.creditLimit=creditLimit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	};
	
	
	@Override public void debit(double x){
		//if (getBalance()-x<-creditLimit){
			//System.out.println("You can't withdrawal in this account.");
		//}else{
		setBalance(getBalance()-x);
		//}
	};

	public void getCreditlimit(double x){
		creditLimit=x;
	}
	
	public void nextMonth(){
		if(getBalance()>0){
			setBalance(getBalance()*(1+interest));
		}else if(getBalance()<0){
			setBalance(getBalance()*(1+loan_interest));
		}
		
		
	}
	
	public boolean isBankrupted(){
		if(getBalance()<-creditLimit){
			return true; 
		}else{
			return false;
		}
	}
	
	@Override 
	public double getWithdrawableAccount(){
		if(getBalance() + creditLimit>=0){
			return getBalance() + creditLimit;
		}else{
			return 0;
		}
	};
	
	@Override
	public void passTime(int x){
		for(int i=0;i<x;i++){
			nextMonth();
		}
	}

}
