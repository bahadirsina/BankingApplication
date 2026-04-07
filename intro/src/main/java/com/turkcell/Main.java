package com.turkcell;

public class Main {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new InMemoryCustomerRepository();
        AcountRepository accountRepository = new InMemoryAccountRepository();

        Customer customer1 = new Customer(11,"John", "Doe", 18);
        customerRepository.save(customer1);
        Customer customer2 = new Customer(15,"John", "Doe", 18);
        if (customerRepository.save(customer2)) {
        System.out.println("Müşteri eklendi.");
        } else {
        System.out.println("Aynı ID bulunduğu için müşteri eklenemedi.");
        }

        Account account1 = new Account(123456, customer1);
        account1.setActive(true);

        //System.out.println("Customer Name: " + customer1.getName() + " " + customer1.getSurname());
        //System.out.println("Customer Age: " + customer1.getAge());
        //System.out.println("Customer ID: " + customer1.getId());
        //System.out.println("Account Number: " + account1.getAccountNumber());
        //System.out.println("Is Account Active? " + account1.isActive());    
        
    }
}