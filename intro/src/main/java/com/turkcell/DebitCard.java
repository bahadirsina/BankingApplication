package com.turkcell;

public class DebitCard extends BankCard {

    DebitCard(int cardNumber, Account account) {
        super(cardNumber, account);
    }

    DebitCard() {
        
    }

    private String ibanNumber;
    private float balance;
    
    public String getIbanNumber() {
        return ibanNumber;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void setIbanNumber(String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }
    public void deposit(float amount) {
    if (!super.getAccount().isActive()) {
        System.out.println("Account is passive.");
        return;
    }
    if (amount > 0) {
        this.setBalance(this.getBalance() + amount);
        System.out.println(getAccount().getCustomer().getName() + " " + getAccount().getCustomer().getSurname() + " deposited " + amount);
    }
}


}
