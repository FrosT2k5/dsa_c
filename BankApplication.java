
import java.util.Scanner;

class employee {
	float amount;
	float balance=0;
	Scanner in = new Scanner(System.in);

	public void createAccount() 
	{
		System.out.println("Enter customer name: ");
		String name = in.next();
		System.out.println("Enter account number: ");
		int accno = in.nextInt();
		System.out.println("Enter mobile no: ");
		int mobno = in.nextInt();
		System.out.println("Enter address: ");
		in.nextLine();
		String addr = in.nextLine();
		System.out.println("Account Details are: ");
		System.out.println("Name\t"+"Acc. No\t"+"Mobile No\t"+"Address\t");
		System.out.println(name+"\t"+accno+"\t"+mobno+"\t"+addr+"\t"+"\n");
		System.out.println("Account Created Successfully");
	}

	public void deposit()
	{
		System.out.println("Amount to deposit: ");
		amount = in.nextFloat();
		if (amount<=0)
			System.out.println("Can't deposit nonpositive amount");
		else {
			balance += amount;
			System.out.println("Rs"+amount+"has been deposited.");
		}			
	}
	public void withdraw()
	{
		System.out.println("Amount to withdraw: ");
		amount = in.nextFloat();
		if (amount<=0||amount>balance)
			System.out.println("Withdrawl can't be completed");
		else {
			balance -= amount;
			System.out.println("Rs"+amount+"has been withdrawn.");
		}			
	}
	public void displayBalance() {
		System.out.println("Your Balance: Rs"+balance);
	}
}

public class BankApplication {
	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		int choice;
		employee b = new employee();
		do {
			System.out.println("1.Create Account");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Display Balance");
			System.out.println("5.Exit");
			System.out.println("Enter your choice: ");
			choice = in1.nextInt();
			switch (choice) {
			case 1:
				b.createAccount();
				break;
			case 2:
				b.deposit();
				break;
			case 3:
				b.withdraw();
				break;
			case 4:
				b.displayBalance();
				break;
			case 5:
				break;
			default:
				System.out.println("Wrong Choice. ");
				break;
			}
		} while (choice!=5);
	}
}