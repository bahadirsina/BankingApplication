package com.turkcell;

import java.util.HashMap;
import java.util.Map;

public class InMemoryAccountRepository implements AcountRepository {

        private Map<Integer, Account> accounts = new HashMap<>();

    @Override
    public void save(Account account) {
        accounts.put(account.getId(), account);
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
