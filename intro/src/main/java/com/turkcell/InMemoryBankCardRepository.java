package com.turkcell;

import java.util.HashMap;
import java.util.Map;

public class InMemoryBankCardRepository implements BankCardRepository {
    private Map<Integer, BankCard> bankCards = new HashMap<>();

    @Override
    public boolean save(BankCard card) {
        if (bankCards.containsKey(card.getCardNumber())) {
            return false;
        }
        bankCards.put(card.getCardNumber(), card);
        return true;
    }

    @Override
    public BankCard findByCardNumber(int cardNumber) {
        return bankCards.get(cardNumber);
    }

    @Override
    public void deleteByCardNumber(int cardNumber) {
        bankCards.remove(cardNumber);
    }

    @Override
    public void findAll() {
        for (BankCard card : bankCards.values()) {
            System.out.println(card);
        }
    }

}
