package ques10;

public class CheckingAccount extends BankAccount {
    @Override
    public void withdraw(double amount){
        if(amount <= 500){
            System.out.println("insufficient balance withdraw not allowed");
        } else if(amount > 500){
            System.out.println("you can withdraw successfully");
        }

    }

}
