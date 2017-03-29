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
			System.out.println("���� ����� �� �����ϴ�.");
		}else{
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
	public double getWithdrawableAccount(){
		if(getBalance()>=0){
			return getBalance();
		}else{
			return 0;
		}
	}
}
