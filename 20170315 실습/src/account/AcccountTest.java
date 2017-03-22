package account;

import java.util.Scanner;

public class AcccountTest {
	public void nowBalance(Account a,Account b){
			a.balance();
			b.balance();
	}
	
	public static void main(String[] args){
		Account account1=new Account("account1");
		Account account2=new Account("account2");
		double am,bm;
		
		System.out.print("Add the money to the account1:");
		Scanner input= new Scanner(System.in);
		am=input.nextDouble();
		account1.credit(am);
		System.out.print("Add the money to the account2:");
		bm=input.nextDouble();
		account2.credit(bm);
		
		account1.balance();
		account2.balance();
		
		System.out.print("\nEnter withdrawal amount fot account1:");
		am=input.nextDouble();
		System.out.printf("\nsubtracting %f from account1 balance.\n",am);
		if (account1.getmoney()<am){
			System.out.print("Debit amount exceeded account balance.");
		}
		account1.debit(am);
		account1.balance();
		account2.balance();
		
		System.out.print("\nEnter withdrawal amount fot account2:");
		bm=input.nextDouble();
		System.out.printf("\nsubtracting %f from account1 balance.\n",bm);
		if (account2.getmoney()<bm){
			System.out.print("Debit amount exceeded account balance.\n");
		}
		account2.debit(bm);
		account1.balance();
		account2.balance();
		
	}

}
