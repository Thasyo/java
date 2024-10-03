package application;

import example01.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		//Inheritance
		BusinessAccount account = new BusinessAccount();
		account.setHolder("Thasyo");
		System.out.println(account.getHolder());
	}

}
