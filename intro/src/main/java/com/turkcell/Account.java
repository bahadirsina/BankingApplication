package com.turkcell;

public class Account extends Customer {
    public Account(int accountNumber, Customer customer) {
        if (customer.getAge() < 18) {
            throw new IllegalArgumentException("Only customers aged 18 and above can create an account.");
        }
    this.AccountNumber = accountNumber;
    this.customer = customer;
    this.isActive = true;
    }

    Account() {
        
    }

    private int AccountNumber;
    private boolean isActive;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public int getAccountNumber() {
        return AccountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public void activateAccount() {
    this.isActive = true;
    }
    public void deactivateAccount() {
    this.isActive = false;
    }
    

}
