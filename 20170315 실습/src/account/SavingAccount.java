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
			System.out.println("���� �Ա��� �� �����ϴ�.");
		}else{
			super.credit(x);
		}
	}
	@Override
	public void debit(double x) throws Exception{
		if(getBalance()-x<0) throw new Exception("Over credit");
		if(x<0) throw new Exception("Input minus");
		if(passMonth<12) throw new Exception("�ƣ� ����� �� �����ϴ�.");
		//{
			//System.out.println("���� ����� �� �����ϴ�.");
		//}else{
		if(passMonth>=12){
			if(getBalance()-x>0){
				setBalance(getBalance()-x);
			}else{
				System.out.println("�ܾ��� �����Ͽ� ����� �Ұ����մϴ�.");
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
	public double getWithdrawableAmount(){
		if(getBalance()>=0){
			return getBalance();
		}else{
			return 0;
		}
	}
	
	@Override public double EstimateValue(int month){
		passTime(month);
		return firstBalance*Math.pow((1+interest),passMonth);
	}
	
	@Override public String toString(){
		return String.format("SavingAccount_Balance: %.2f", getBalance());
	}
}
