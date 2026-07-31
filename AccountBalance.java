//1.if statement
//2.Nested if
//3.do-while loop
import java.util.Scanner;
public class AccountBalance{
  public static void main(String[]args){
    double account_balance=0.00;
    Scanner scanner=new Scanner(System.in);
    int pin=0;
    int Confirmpin=1;
    do{
      System.out.println("Please enter your pin");
      pin=scanner.nextInt();
      System.out.println("Please confirm your pin");
      Confirmpin=scanner.nextInt();
      if(pin==Confirmpin){
         System.out.println("Pin Confirmed");
      }else{
         System.out.println("Pin is not the same please try again");
      }
     }while(pin!=Confirmpin); 
     int choice=0;
    do{System.out.println("1.Withdraw\t2.Deposit\t3.Exit");
    System.out.println("Please enter an option");
    if(scanner.hasNextInt()){
      choice=scanner.nextInt();
   }else{
       System.out.println("Invalid choice.Please enter 1,2, or 3");
       scanner.next();
       choice=0;
       continue;
     }
    if(choice==1){
       System.out.println("1.2000\t4.8000");
       System.out.println("2.4000\t5.10000");
       System.out.println("3.6000\t6.12000");
       System.out.println("  \t7.other options");
       System.out.println("Please enter the amount you want to withdraw");
       int withdraw=scanner.nextInt();
       if(withdraw==1){
         if(account_balance>=2000){
         System.out.println("account balance= "+(account_balance-2000));
         account_balance=account_balance-2000;
         }else{
         System.out.println("Insufficient funds");
        }
       }else if(withdraw==2){
        if(account_balance>=4000){
         System.out.println("account balance= "+(account_balance-4000));
         account_balance=account_balance-4000;
         }else{
         System.out.println("Insufficient funds");
         }
    }else if(withdraw==3){
         if(account_balance>=6000){
         System.out.println("account balance= "+(account_balance-6000));
         account_balance=account_balance-6000;
         }else{
         System.out.println("Insufficient funds");
        }
   }else if(withdraw==4){
         if(account_balance>=8000){
         System.out.println("account balance= "+(account_balance-8000));
         account_balance=account_balance-8000;
         }else{
         System.out.println("Insufficient funds");
        }
   }else if(withdraw==5){
         if(account_balance>=10000){
         System.out.println("account balance= "+(account_balance-10000));
         account_balance=account_balance-10000;
         }else{
         System.out.println("Insufficient funds");
        }
   }else if(withdraw==6){
         if(account_balance>=12000){
         System.out.println("account balance= "+(account_balance-12000));
         account_balance=account_balance-12000;
         }else{
         System.out.println("Insufficient funds");
        }
    }else if(withdraw==7){
          System.out.println("Please enter the amount you want to withdraw?");
          if(account_balance>=withdraw){
            double wd=scanner.nextDouble();
          System.out.println("account balance= "+(account_balance-wd));
          account_balance=account_balance-wd;
         }else{
         System.out.println("Insufficient funds");
        }
          
   }
  }else if(choice==2){
    System.out.println("Please enter the amount you want to deposit");
    double deposit=scanner.nextDouble();
    System.out.println("New account balance= "+(account_balance+deposit));
    account_balance=account_balance+deposit;
  }else if(choice==3){
     System.out.println("Thank you for using the ATM. Goodbye!");
  }
  }while(choice!=3);
 }
}
       
       