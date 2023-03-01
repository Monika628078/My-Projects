import java.text.SimpleDateFormat;
import java.util.*;

public class AtmMachine {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     AtmFunc atm = new AtmFunc();
     int option;
        System.out.println("welcome to Sam's ATM");
        System.out.println("******************************************---------------------******************************");
       do {
           System.out.println("press 1 for check the balance");
           System.out.println("press 2 for changing pin");
           System.out.println("press 3 for deposit money");
           System.out.println("press 4 for withdraw");
           System.out.println("press 5 for mobile number related services");
           System.out.println("press 6 for exit");
           System.out.println("please choose appropriate option");
            option = sc.nextInt();

           switch (option) {
               case 1:
                     atm.balanceDisplay();
                   break;
               case 2:
                     atm.pinChag();
                   break;
               case 3:
                   atm.addMoney();
                   break;
               case 4:
                   atm.forWithdraw();
                   break;
               case 5:
                   atm.mobDetail();
                   break;
               case 6:
                   System.exit(0);
               default:
                   System.out.println("invalid option");
           }
       }while(option != 5);
    }
}
class AtmFunc {
    SimpleDateFormat d1 = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
    Date d = new Date();
    short pin = 1234;
    int i=0;
    Scanner sc = new Scanner(System.in);
    float balance = 0, deposit, withdraw;
    long mobile_number = 8146931469L;

    void balanceDisplay()
    {
        System.out.println("******************************************---------------------******************************");
        System.out.println("balance of your account is = " + balance);
        System.out.println("******************************************---------------------******************************");

    }

    float addMoney() {
        if (balance >= 500000) {
            System.out.println("******************************************---------------------******************************");
            System.out.println("your account reached maximum limit");
            System.out.println("******************************************---------------------******************************");
       }
            else {
            System.out.println("Enter amount to deposit in your account");
            deposit = sc.nextFloat();
            if (deposit >= 500000) {
                System.out.println("******************************************---------------------******************************");
                System.out.println("invalid amount entered");
                System.out.println("please entere amount below 500000");
                System.out.println("******************************************---------------------******************************");
            }
            if (deposit <= 500000) {
                balance += deposit;
                System.out.println("******************************************---------------------******************************");
                System.out.println("your account has been credit by  Rs. " + deposit + "  Dt  " + d1.format(d));
                System.out.println("******************************************---------------------******************************");
            }
        }
        return balance;
    }
    float forWithdraw()
    {
        if(balance == 0) {
            System.out.println("******************************************---------------------******************************");
            System.out.println("insufficient balance to withdraw");
            System.out.println("please add money than you will be able to perform withdraw action");
            System.out.println("******************************************---------------------******************************");
        }
        else
        {
            System.out.println("Enter amount which you want to Withdraw from your account");
            withdraw = sc.nextFloat();
            if(withdraw > balance)
            {
                System.out.println("Insufficient balance!!!!");
                System.exit(0);
            }
            else {

                for(; i<3; i++)
                {
                    System.out.println("Please Enter your PIN");
                    short pin2 = sc.nextShort();
                  if(pin == pin2)
                  {
                      System.out.println("******************************************---------------------******************************");
                      System.out.println("Processing please wait");
                    break;
                  }
                   else
                   {
                        System.out.println("invalid pin");
                   }
                }if(i==3) {
                    System.out.println("Card has been blocked !!!!!");
                    System.exit(0);
                }
            }
            balance -= withdraw;
            System.out.println("your transaction has been successful");
            System.out.println("your account has been depit INR " + withdraw + "  Dt  " + d1.format(d));
            System.out.println("Thanks for using our survice" );
            System.out.println("******************************************---------------------******************************");
        }
        return balance;
    }
    long mobDetail()
    {
        System.out.println("******************************************---------------------******************************");
        System.out.println("your registered mobile number is = " + mobile_number);
        System.out.println("******************************************---------------------******************************");
        System.out.println("do you want to change your mobile number");
        System.out.println("press Y for changing mobile number");
        System.out.println("press N for no change");
        char choice = sc.next().charAt(0);
        switch (choice)
        {
            case 'Y', 'y':
                System.out.println("Enter new number : ");
                mobile_number = sc.nextLong();
                System.out.println("******************************************---------------------******************************");
                System.out.println("your mobile number changing request has been accepted");
                System.out.println("******************************************---------------------******************************");
                break;
            case 'N', 'n':
                System.out.println("It's ok");
                System.out.println("******************************************---------------------******************************");
                break;
            default:
                System.out.println("choose appropriate option");
        }
        return mobile_number;
    }
    short pinChag(){
        System.out.println("do you want to change pin");
        System.out.println("press Y for changing pin");
        System.out.println("press n for no change");
        char choice = sc.next().charAt(0);
        switch (choice)
        {
            case 'Y', 'y':
                System.out.println("Enter new pin");
                pin = sc.nextShort();
                System.out.println("******************************************---------------------******************************");
                System.out.println("Pin has been changed successfully");
                System.out.println("******************************************---------------------******************************");
                break;
            case 'N' , 'n':
                break;
        }
        return pin;
    }

}

