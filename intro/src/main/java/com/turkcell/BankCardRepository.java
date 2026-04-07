package com.turkcell;

public interface BankCardRepository {
    void save(BankCard card);
    BankCard findByCardNumber(int cardNumber);
    void deleteByCardNumber(int cardNumber);
    void findAll();
}
