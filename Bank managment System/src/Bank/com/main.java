package Bank.com; 

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  operation op =new operation();
  while (true){
	  System.out.println("Select from given ");
	  System.out.println(" 1:create account \n 2:show account details\n 3: balance  ");
	  System.out.println("");	
	 int a=sc.nextInt();
	switch(a) {
	     case 1:
	    	 op.openAccount();
	    	 break;
	     case 2:
	    	 op.show();
	    	 break;
	     case 3:
	    	 op.balance();
	 
	 
	 }  
  }
	}

}
