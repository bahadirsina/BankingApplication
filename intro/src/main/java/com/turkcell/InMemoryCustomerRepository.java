package com.turkcell;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCustomerRepository implements CustomerRepository {
    private Map<Integer, Customer> customers = new HashMap<>();

    @Override
    public boolean save(Customer customer) {
    if (customers.containsKey(customer.getId())) {
        return false;
    }
    customers.put(customer.getId(), customer);
    return true;
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void deleteById(int id) {
        customers.remove(id);
    }

    @Override
    public void findAll() {
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }
    }
}
