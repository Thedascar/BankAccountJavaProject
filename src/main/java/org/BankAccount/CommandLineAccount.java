package org.BankAccount;

import java.util.Scanner;

public class CommandLineAccount {
    public static void main(String[] args) {



       commandLineDisplay();



    }

    public static void commandLineDisplay(){
        Scanner scanner = new Scanner(System.in);

        int accountNumber;
        String bankAgency;
        String clientName;
        double balance;

        System.out.println("Please Type Your Account: ");
        accountNumber = scanner.nextInt();

        System.out.println("Please Type Your Name: ");
        clientName = scanner.nextLine();
        clientName = scanner.nextLine();

        System.out.println("Please Type Your Bank Agency: ");
        bankAgency = scanner.nextLine();

        System.out.println("Please Type Your First Deposit: ");
        balance = scanner.nextDouble();

        String response = String.format("Hello [%s] , Account Have Been Created Thanks By Your Choice" +
                "Your Agency is [%s]%n,Account [%d] and Balance [$ %.2f] is already to use it",clientName,bankAgency,accountNumber,balance);
        System.out.println(response);
    }
}
