package com.turkcell;

import java.util.HashMap;
import java.util.Map;

public class InMemoryAccountRepository implements AcountRepository {

        private Map<Integer, Account> accounts = new HashMap<>();

    @Override
    public boolean save(Account account) {
    if (accounts.containsKey(account.getAccountNumber())) {
        return false;
    }
    accounts.put(account.getAccountNumber(), account);
    return true;
    }

    @Override
    public Account findByAccountNumber(int accountNumber) {
        return accounts.get(accountNumber);
    }

    @Override
    public void deleteByAccountNumber(int accountNumber) {
        accounts.remove(accountNumber);
    }

    @Override
    public void findAll() {
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }

}
