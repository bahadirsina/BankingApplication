package com.turkcell;

public class BankCard {

    BankCard() {
        
    }

    private int cardNumber;
    private Account account;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
