package com.turkcell;

public interface CustomerRepository   {
    boolean save(Customer customer);
    Customer findById(int id);
    void deleteById(int id);
    void findAll();

}
