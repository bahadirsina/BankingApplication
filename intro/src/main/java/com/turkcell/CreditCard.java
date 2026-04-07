package com.turkcell;

public class CreditCard extends BankCard {

    CreditCard(int cardNumber, Account account) {
        super(cardNumber, account);
    }

    CreditCard() {
        
    }

    private float creditLimit;
    private String creditCardType;
    private float usedLimit;

    public float getUsedLimit() {
        return usedLimit;
    }

    public void setUsedLimit(float usedLimit) {
        this.usedLimit = usedLimit;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }
    public void spend(float amount) {
    if (amount <= 0) {
        System.out.println("Invalid amount.");
        return;
    }
    if (usedLimit + amount > creditLimit) {
        System.out.println("Credit limit is not enough.");
        return;
    }
    usedLimit += amount;
    System.out.println(getAccount().getCustomer().getName() + " " + getAccount().getCustomer().getSurname() + " spent " + amount + " by credit card.");
    }
    public void increaseLimit(float amount) {
    if (amount > 0) {
        creditLimit += amount;
    }
    }
    public void decreaseLimit(float amount) {
    if (amount > 0 && creditLimit - amount >= usedLimit) {
        creditLimit -= amount;
    } else {
        System.out.println("Limit cannot be reduced below used limit.");
    }
    }

}
