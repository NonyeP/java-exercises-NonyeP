package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.List;

//not yet finished implementation
public class Banking {
   
    private List<Accounts> accts;
    private String accountType;

    public Banking(List<Accounts> accts) {
        this.accts = new ArrayList<>();
    }

    public void showAccountDetails() {  
        System.out.println("Name of Account holder: " + name);  
        System.out.println("Account Number.: " + accno);  
        System.out.println("Account type: " + accountType);  
        System.out.println("Balance: " + balance);  
    }  

    
}
