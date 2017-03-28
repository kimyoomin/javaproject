package account;

public class CheckingAccount extends Account {
	
	CheckingAccount(double balance, double interest, double loan_interest){
		super(balance);
		this.interest=interest;
		this.loan_interest=loan_interest;
	};
	
	private double credit_limit=100;
	private double interest;
	private double loan_interest;
	
	@Override public void debit(double x){
		if (getBalance()-x<-credit_limit){
			System.out.println("You can't withdrawal in this account.");
		}else{
			setBalance(getBalance()-x);
		}
	};

	public void getCreditlimit(double x){
		credit_limit=x;
	}
	
	public void nextMonth(){
		if(getBalance()>0){
			setBalance(getBalance()*(1+interest));
		}else if(getBalance()<0){
			setBalance(getBalance()*(1+loan_interest));
		}
		
		
	}

}
