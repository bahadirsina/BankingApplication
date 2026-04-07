package com.turkcell;

public interface AcountRepository {
    boolean save(Account account);
    Account findByAccountNumber(int accountNumber);
    void deleteByAccountNumber(int accountNumber);
    void findAll();
}
