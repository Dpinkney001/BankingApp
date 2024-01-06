package com.example.bankingapp

class BankingApp {
    enum accountTypes : string = { "option", "Debit account", "Credit account", "Checking account"}


    public main(){
        println("Welcome to your banking system.");
        println("What type of account would you like top crtate?");
        println("1. Debit account");
        println("2. Credit account");
        println("3. Checking account");
        println("Choose an option (1, 2 or 3)");


        switch(accountTypes){
            case "Debit account":

            case "Credit account":
            case "Checking account":

        }
    };




}