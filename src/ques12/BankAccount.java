package ques12;

public class BankAccount {



    private int accountNumber;
    private int balance;

    public BankAccount(){

    }
    public int getaccountNumber(){return accountNumber;}
    public int getbalance(){return balance;}
    public void setaccountNumber(int accountNumber){this.accountNumber = accountNumber;}
    public void setbalance(int balance){this.balance = balance;}
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.setaccountNumber(123456987);
        b.setbalance(100000);
        System.out.println(b.getaccountNumber());
        System.out.println(b.getbalance());
        System.out.println("****************************");
        b.setaccountNumber(45268965);
        b.setbalance(500000);
        System.out.println(b.getaccountNumber());
        System.out.println(b.getbalance());


    }



    }

