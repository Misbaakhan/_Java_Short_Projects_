package practiceANDrevision;
import java.util.Scanner;
public class AtmMenuSimulation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float balance=25000.50f;
		float amount;
		while(true) {
			System.out.println("----ATM Menu Simulation----");
			System.out.println("1. Check Balance");
		 	System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.println("Select the option");
			int num=sc.nextInt();
			switch(num) {
			case 1:System.out.println("1. Check Balance");
			System.out.println("the balance amount is"+balance);
			break;			
			case 2: System.out.println("2. Deposit Money");
			System.out.println("enter the amount to deposit :");
			amount=sc.nextFloat();
			if(amount<=0) {
				System.out.println("Invalid deposit amount.");
			}else{
				balance=balance+amount;			
			System.out.println("Deposit successful. "+"\n"+"Updated balance:"+balance);
			}
			break;
			
			case 3: System.out.println("3. Withdraw Money");
			System.out.println("enter the amount to withdraw :");
			amount=sc.nextFloat();
			if(amount<=0) {
				System.out.println("Invalid withdraw amount.");
			}
			else if(balance>amount) {
				balance=balance-amount;
			System.out.println("total balance after withdraw is "+balance);
			}else {
				System.out.println("insufficient balance");
			}break;
			
			case 4:System.out.println("Exiting ATM. Thank you!");
			sc.close();
			return;
			default:
                System.out.println("Invalid option. Please try again.");
        }
			}
			
		}			
	}

