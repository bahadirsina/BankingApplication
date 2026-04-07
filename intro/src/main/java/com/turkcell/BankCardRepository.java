package com.turkcell;

public interface BankCardRepository {
    boolean save(BankCard card);
    BankCard findByCardNumber(int cardNumber);
    void deleteByCardNumber(int cardNumber);
    void findAll();
}
