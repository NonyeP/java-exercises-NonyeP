package com.cbfacademy.accounts;

import java.math.BigDecimal;


public class SavingsAccount extends Accounts {
    private double interest;


    public static void main(String[] args) {
        //Accounts acct1 = new SavingsAccount("9876543", 3000);
        //SavingsAccount acct = new SavingsAccount("123456", 500);
        //System.out.println(acct.addInterest());
        //System.out.println(acct.addInterest());
        //System.out.println(acct.deposit(500));
        //System.out.println(acct.deposit(3000));
    }
    
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
        this.interest = 1.56;
        
    }
    

    public SavingsAccount(String name, String accountNumber) {
        super(name, accountNumber);
        
    }

    public double getInterest() {
        return this.interest;
    }
    
    public BigDecimal addInterest(){
        System.out.println("Previous Balance = £" + super.getBalance());
        double amount = super.getBalance() * interest/100;
        System.out.println("Interest on £" + super.getBalance() + " is: £" + amount);
        double newBalance = amount + super.getBalance();
        System.out.println("New Balance = £" +  newBalance);
        return super.deposit(amount);
       
    }
    public double getInterest() {
        return interest;
    }


    //when to add interest only at day 28
    public void TimeToAddInterest() {
        int the1st = 1;
        int at16hrs = 16;

        MonthlyTimer t = MonthlyTimer.schedule(new Runnable() {
            public void run() {
                System.out.println( "You are due for Monthly interest " );
                addInterest();
            }}, the1st, at16hrs );

        // will print "You are due for Monthly interest" every 1st at 16:00 hrs.
        t.cancelCurrent();

    }
    
}
