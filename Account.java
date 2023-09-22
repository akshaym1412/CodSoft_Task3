import java.util.Scanner;

public class Account extends AtmMachine{

    public void UserOperation() throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select any one options to continue\n 1.Deposit\n 2.Withdraw\n 3.Check Balance\n 4.Exit ");
        int i=sc.nextInt();
        switch(i){
            case 1:
                System.out.println("Enter the amount to be deposited");
                super.deposit(sc.nextInt());
                Thread.sleep(1000);
                UserOperation();
                break;
            case 2:
                System.out.println("Enter amount to be withdraw");
                super.withdraw(sc.nextInt());
                Thread.sleep(1000);
                UserOperation();
                break;
            case 3:
                int balance= super.checkBalanace();
                System.out.println("----------------------------------------------");
                System.out.println("Your balance is "+balance);
                System.out.println("----------------------------------------------");
                Thread.sleep(1000);
                UserOperation();
                break;
            case 4:
                System.out.println("Thanks of Banking with us !!!!!!");
                break;
            default:
                System.out.println("Enter proper input");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------WELCOME TO ATM SERVICE---------------");
        System.out.println("Please insert your atm card and press any key to continue ");
        sc.next();
        System.out.print("Enter your pin : ");
        sc.nextInt();
        Account atm=new Account();
        atm.UserOperation();
    }
}
