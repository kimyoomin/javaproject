package account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AcccountTest {
	public static void main(String[] args){
		
		Account account1=new CheckingAccount(100,50,0.1,0.07);
		Account account2=new SavingAccount(100,0.05);
		
		Scanner scan = new Scanner(System.in);
		double amount;
		
		try{
			
			System.out.println("Enter deposit amount for Account1: ");
			amount=scan.nextDouble();
			account1.debit(amount);
			System.out.println("Account 1's balance: $"+account1.getBalance());
			
			System.out.println("Enter deposit amount for Account2: ");
			amount=scan.nextDouble();
			account2.debit(amount);
			System.out.println("Account 2's balance: $"+account2.getBalance());
			
		}catch(InputMismatchException e){
			System.out.println("예외 발생: 숫자를 입력하세요\n"+e.toString());
		}catch(Exception e){
			System.out.println("예외발생  "+e.toString());
		}finally{
			account1.passTime(2);
			System.out.println("2 month later account 1 : "+ account1.getBalance());
		}
	}

}
