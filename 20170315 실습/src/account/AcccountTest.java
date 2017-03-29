package account;

import java.util.Scanner;

public class AcccountTest {
	public static void main(String[] args){
		
		Account account1=new CheckingAccount(100,50,0.1,0.07);
		Account account2=new SavingAccount(100,0.05);
		
		Scanner scan=new Scanner(System.in);
		double amount;
		
		//CheckingAccount
		System.out.printf("Account1 balance: $%.2f\t 현재출금가능액: %.2f \n",account1.getBalance(), account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1: ");
		amount=scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: $%.2f\t 현재출금가능액: %.2f \n",account1.getBalance(), account1.getWithdrawableAccount());
		
		//파산여부확인
	
		if(((CheckingAccount)account1).isBankrupted()==true){
			System.out.println("account1 went Bankrupt");
		}
		
		account1.passTime(1);
		System.out.printf("Account1 balance: $%.2f\t 현재출금가능액: %.2f \n",account1.getBalance(), account1.getWithdrawableAccount());
		
		//파산여부
		if(((CheckingAccount)account1).isBankrupted()==true){
			System.out.println("account1 went Bankrupt");
		}
		
		account1.passTime(5);
		System.out.printf("Account1 balance: $%.2f\t 현재출금가능액: %.2f \n",account1.getBalance(), account1.getWithdrawableAccount());
		//파산여부
		if(((CheckingAccount)account1).isBankrupted()==true){
			System.out.println("account1 went Bankrupt");
		}
		
		//SavintAccount
		System.out.println();
		System.out.printf("Account2 balance: $%.2f\t 현재출금가능액: %.2f \n",account2.getBalance(), account2.getWithdrawableAccount());
		
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f\t 현재출금가능액: %.2f \n",account2.getBalance(), account2.getWithdrawableAccount());
		account2.debit(50);
		
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f\t 현재출금가능액: %.2f \n",account2.getBalance(), account2.getWithdrawableAccount());
		
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance: $%.2f\t 현재출금가능액: %.2f \n",account2.getBalance(), account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance: $%.2f\t 현재출금가능액: %.2f \n",account2.getBalance(), account2.getWithdrawableAccount());
		
		
	}

}
