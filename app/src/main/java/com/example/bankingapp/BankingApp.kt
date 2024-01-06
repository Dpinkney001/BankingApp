package com.example.bankingapp

class BankingApp {
    enum accountType : Int = { Debit, Credit, Checking };

    fun main(){
        println("Welcome to your banking system.");
        println("What type of account would you like top crtate?");
        println("1. Debit account");
        println("2. Credit account");
        println("3. Checking account");
        println("Choose an option (1, 2 or 3)");
        var accountType = readln();

        switch(accountType){
            case 1:

            case 2:
            case 3:

        }
    };




}