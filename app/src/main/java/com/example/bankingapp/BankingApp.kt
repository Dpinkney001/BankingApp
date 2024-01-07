package com.example.bankingapp
import "DebitAccount.kt";
import ""

class BankingApp {


    fun main(){

        var userChoice = 0;

        var userChoice = {
            Exit = -1;
            Base = 0;
            Debit = 1;
            Credit = 2;
            Checking = 3; };

        while (userChoice != -1) {
            accountType = " ";

            println("Welcome to your banking system.");
            println("What type of account would you like top crtate?");
            println("1. Debit account");
            println("2. Credit account");
            println("3. Checking account");
            println("Choose an option (1, 2 or 3)");

            accountType = readln();

            switch(accountType) {
                case -1:
                   break;
                case 0:

                case 1:
                    DebitAccount();
                    println("You have created a Debit account");

                case 2:
                    CreditAccount();
                    println("You have created a Credit account");

                case 3:
                    CheckingAccount();
                    println("You have created a Checking account");

            }
        }// end while loop
    };




}