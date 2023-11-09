package ques10;

public class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount){
        if(amount <= 1500){
            System.out.println("minimum interest fee charged");
        } else if(amount > 1500){
            System.out.println("No fees charged");
        }

    }
    public static void main(String[] args){
        CheckingAccount object = new CheckingAccount();
        object.withdraw(600);
        SavingsAccount object1 = new SavingsAccount();
        object1.withdraw(1800);

    }
}

