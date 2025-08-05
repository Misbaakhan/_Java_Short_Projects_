package newPackage;

import java.util.Scanner;
class TrainBookingSystem{
	public void searchTrains(String user) {
		System.out.println(user + " is  searching for the correct train");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void bookSeat(String user) {
		System.out.println(user + " is booking seat for herself");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void makePayment(String user) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("select the mode of  payement");
		System.out.println("1 : ----UPI---");
		System.out.println("2 : ---Credit Card/DebitCard---");
		System.out.println("3 : ----Net Banking -----");
		System.out.println("4 : ------Wallets----");		
		int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("----UPI---");
		        break;
		case 2 :System.out.println("---Credit Card/DebitCard---");
		        break;
		case 3 :System.out.println(" ----Net Banking -----");
		        break;
		case 4 :System.out.println("------Wallets----");
		        break;
		default :System.out.println("no mode of payment is selected");
		
		}
		System.out.println(user + "  has made the payment for the train seat  booking");
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class CustomerThread implements Runnable{
	String userName;	
	TrainBookingSystem tbs;
	public CustomerThread(String userName,TrainBookingSystem tbs) {
		this.userName=userName;
		this.tbs=tbs;
	}
	public void run() {
		tbs.searchTrains(userName);
		tbs.bookSeat(userName);
		tbs.makePayment(userName);
	}
	
}
public class TrainBookingSystemApp {
	public static void main(String[] args) {
		TrainBookingSystem tbs=new TrainBookingSystem();
		CustomerThread ct1=new CustomerThread("misba",tbs);
		CustomerThread ct2=new CustomerThread("mina",tbs);
		CustomerThread ct3=new CustomerThread("geeta",tbs);
		Thread t1=new Thread(ct1);
		Thread t2=new Thread(ct2);
		Thread t3=new Thread(ct3);
		t1.start();
		t2.start();
		t3.start();
	}
	

}
