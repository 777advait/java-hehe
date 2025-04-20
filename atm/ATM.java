package atm;

import java.util.Scanner;

public class ATM {
  static int balance = 10000;
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      System.out.print("\nChoose an operation\n1. Check Balance\n2. Deposit\n3. Withdraw\n0. Exit\n>>> ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Your balance: " + balance);
          break;

        case 2:
          System.out.println("Enter the amount to be deposited: ");
          int depositAmount = sc.nextInt();
          balance += depositAmount;
          System.out.println("Updated Balance: " + balance);
          break;
        
        case 3:
          System.out.println("Enter the amount to be deposited: ");
          int withdrawAmount = sc.nextInt();
          balance -= withdrawAmount;
          System.out.println("Updated Balance: " + balance);
          break;

        case 0:
          System.out.println("Exiting...");
          System.exit(0);
      
        default:
          System.out.println("[ERROR] Invalid operation selected!!");
          break;
      }
    }
  }
}