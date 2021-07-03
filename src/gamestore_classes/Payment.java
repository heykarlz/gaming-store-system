/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestore_classes;

import gamestore_gui_classes.Registration;

/**
 *
 * @author Muhammad Haikal Aiman Bin Mohd Puat S59419
 */
public class Payment implements Verification{
   
    private String accountType;
    private String accountName;
    private String accountNumber;
    private String password;
    private String method;
    private int totalPayment;
    private double balance;
    
    //Constructor for object created in PayByDigitalWallet class
    public Payment(String password, double balance) {
        setPassword(password);
        setBalance(balance);
    }
    
    //Constructor for object created in Receipt class
    public Payment(String method, int totalPayment) {
         setMethod(method);
         setTotalPayment(totalPayment);
    }
    
    //Constructor for object created in PayByBankTransfer class
    public Payment(String accountNumber, String accountType, String accountName, int totalPayment) {
        setAccountName(accountName);
        setAccountNumber(accountNumber);
        setAccountType(accountType);
        setTotalPayment(totalPayment);
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getMethod() {
        return method;
    }

    public double getBalance() {
        return balance;
    }
    
    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    @Override
    public String generateVerification() {
        return "Successful Payment of RM" + getTotalPayment();
    }
    
    @Override
    public boolean verifyPassword(String password) throws InvalidPasswordException {
     
        if(!password.equals(Password.getUserPassword())) {
            throw new InvalidPasswordException(0);
        }
        
        return true;
    }
    
}
