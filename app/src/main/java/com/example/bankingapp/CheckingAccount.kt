package com.example.bankingapp
import "CheckingAccountInterface.kt";

class CheckingAccount {
    private Double var balance;
    private Double var amount;
    private Double var withdrawlAmount;

    public fun CheckingAccount()
    {


        fun addMoney(amount : Double) {
            return amount + balance;
        };
        fun debitMoney(withdrawAmount : Double ) {
            return balance - withdrawAmount;
        };

        fun main(){
            val acc = new CheckingAccount();
            println("How much do you want to add?");
            amount = readln();

        }
    }
};