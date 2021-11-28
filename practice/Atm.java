import java.util.Scanner;
class Atm{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to bank: ");
		int pin,cpin,opt,cash;
		System.out.println("Enter the pin");
		pin=s.nextInt();
		if(pin>=1000 && pin<=9999){
			System.out.println("Chose any option:");
			System.out.println("1. Cash Withdrawal: ");
			System.out.println("2. Check balance: ");
			System.out.println("3. Change pin: ");
			System.out.println("4. Exit");
		}
		else{
			System.out.println("You Entered wrong pin");
			return;
		}
		opt=s.nextInt();
		switch(opt){
			case 1:
				System.out.println("Enter the amount of cash: ");
				cash=s.nextInt();
				if(cash>=999999){
					System.out.println("Insufficient balance");
					break;
				}
				else{
					System.out.println("Collect your cash");
					System.out.println("Thank you for using Atm");
					break;
				}
			case 2:
				System.out.println("your balance is Rs.32000");
				break;
			case 3:
				System.out.println("Enter your old pin: ");
				cpin=s.nextInt();
				if(cpin==pin){
					System.out.println("Enter the new Pin: ");
					pin=s.nextInt();
					System.out.println("Your pin id changed Successfully ");
					break;
				}
				else{
					System.out.println("Invalid old Pin");
					break;
				}
			case 4:
				break;
			default:
				{System.out.println("Invalid option selected");
				break;
				}
			
			
		
		}
	
	}
	
}