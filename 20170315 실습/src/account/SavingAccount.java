package account;

public class SavingAccount extends Account{
	
	private double interest;
	private double firstBalance;
	
	public SavingAccount(double balance, double interest){
		super(balance);
		this.firstBalance=balance;
		this.interest=interest;
	}

	@Override
	public void debit(double x){
		if(passMonth<12){
			System.out.println("아직 출금할 수 없습니다.");
		}else{
			if(getBalance()-x>0){
				setBalance(getBalance()-x);
			}else{
				System.out.println("잔액이 부족하여 출금이 불가능합니다.");
			}
		}
	}
	
	@Override
	public void passTime(int x){
		if (passMonth<12){
			double y=firstBalance*Math.pow((1+interest), passMonth);
			setBalance(y);
			passMonth+=x;
		}else{
		}
	}
	@Override 
	public double getWithdrawableAccount(){
		if(getBalance()>=0){
			return getBalance();
		}else{
			return 0;
		}
	}
}
