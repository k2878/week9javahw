package ques3;

import ques10.BankAccount;

public class savingsAccount extends bankAccount {
    savingsAccount(){

    }
    public static void main(String[] args) {

        savingsAccount sc = new savingsAccount();
        sc.withdraw(95);
    }

    @Override
    public void withdraw(double amount){

        if(amount >= 100){
            System.out.println("Withdraw Succesfully");

        }else {
            System.out.println("low amount can't withdraw");
        }
    }



    }














