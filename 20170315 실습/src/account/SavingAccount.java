package account;

public class SavingAccount extends Account{
	
	private double interest;
	private double firstBalance;
	
	public SavingAccount(double balance, double interest){
		super(balance);
		this.firstBalance=balance;
		this.interest=interest;
	}

	@Override public void credit(double x){
		if(passMonth<12){
			System.out.println("아직 입금할 수 없습니다.");
		}else{
			super.credit(x);
		}
	}
	@Override
	public void debit(double x) throws Exception{
		if(passMonth<12) throw new Exception("아짃 출금할 수 없습니다.");
		if(getBalance()-x<0) throw new Exception("Over credit");
		if(x<0) throw new Exception("Input minus");
		//{
			//System.out.println("아직 출금할 수 없습니다.");
		//}else{
		if(passMonth>=12){
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
	public void passTime(){
		passTime(1);
	}
			
	@Override 
	public double getWithdrawableAmount(){
		if(getBalance()>=0){
			return getBalance();
		}else{
			return 0;
		}
	}
	
	@Override public double estimateValue(int month){
		passTime(month);
		return firstBalance*Math.pow((1+interest),passMonth);
	}
	@Override public double estimateValue(){
		return estimateValue(1);
	}
	@Override public String toString(){
		return String.format("SavingAccount_Balance: %.2f", getBalance());
	}
}
