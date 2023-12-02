package Bank.com;

import java.util.Scanner;

public class operation {
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	int accno = 0;
	int s = accno;

	public void openAccount() {

		System.out.println("enter Account number");
		ac.setAccno(sc.nextInt());

		System.out.println("enter Account holder name");
		ac.setName(sc.next());

		System.out.println("enter Account Id");
		ac.setId(sc.next());

		System.out.println("enter Account holder Address");
		ac.setAddress(sc.next());

		while (true) {

			System.out.println("enter Deposite money");
			double d = sc.nextDouble();

			if (d > 499) {
				ac.setMoney(d);
				break;
			} else {
				System.out.println("enterd Deposite money Should be greater than 500");

			}
		}
		System.out.println("Account created Successfully");
	}

	public void show() {
		System.out.println("enter Account number");
		if (ac.getAccno() == sc.nextInt()) {
			System.out.println("Your account number is : " + ac.getAccno());
			System.out.println("Your account holder nmae is : " + ac.getName());
			

		} else {
			System.out.println("you enter wrong account number");
		
	}

	}

	public void balance() {
		System.out.println("Enter a account number : ");
		if (ac.getAccno() == sc.nextInt()) {

			System.out.println("your account balanace is : " + ac.getMoney());
		} else {
			System.out.println("you enter wrong account number : ");
		}

	}

}
