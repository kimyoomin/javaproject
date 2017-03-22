package account;

import java.util.Scanner;

public class AcccountTest {
	public static void nowBalance(Account a,Account b){
			System.out.printf("account1");
			a.checkbalance();
			System.out.printf("account2");
			b.checkbalance();
	}
	
	public static void main(String[] args){
		CheckingAccount account1=new CheckingAccount(100,0.1,0.07);
		CheckingAccount account2=new CheckingAccount(100,0.1,0.07);
		
		double am,bm;
		
		nowBalance(account1,account2);
		
		System.out.print("Enter deposit amount for Account1:");
		Scanner input= new Scanner(System.in);
		am=input.nextDouble();
		account1.credit(am);
		
		nowBalance(account1,account2);
		System.out.print("Enter withdrawal amount for Account2:");
		bm=input.nextDouble();
		account2.debit(bm);
		
		nowBalance(account1,account2);
		
		System.out.println("Next Month!");
		account1.nextMonth();
		account2.nextMonth();
		
		nowBalance(account1,account2);
		
		
	}

}
