package com.turkcell;

public class Main {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new InMemoryCustomerRepository();
        AcountRepository accountRepository = new InMemoryAccountRepository();
        BankCardRepository bankCardRepository = new InMemoryBankCardRepository();

        Customer customer1 = new Customer(11,"John", "Doe", 18);
        customerRepository.save(customer1);
        Customer customer2 = new Customer(16,"Osman", "Yaz", 21);
        customerRepository.save(customer2);
        Customer customer3 = new Customer(17,"Fuat", "Yılmaz", 19);
        if (customerRepository.save(customer3)) {
        System.out.println(customer3.getName() + " " + customer3.getSurname() +" added.");
        } else {
        System.out.println("Because of existing ID, " + customer3.getName() + " " + customer3.getSurname() + " not added.");
        }

        Account account1 = new Account(123456, customer2);
        account1.setActive(true);
        accountRepository.save(account1);
        Account account2 = new Account(123457, customer1);
        account2.setActive(true);
        if (accountRepository.save(account2)) {
        System.out.println(account2.getCustomer().getName() + " " + account2.getCustomer().getSurname() +" account created.");
        } else {
        System.out.println("Because of existing ID, " + account2.getCustomer().getName() + " " + account2.getCustomer().getSurname() + " account not created.");
        }

        DebitCard debitCard1 = new DebitCard(123123, account1);
        debitCard1.setIbanNumber("342341243-657757-123567547451313-567547457TR");
        debitCard1.setBalance(1000);
        if (bankCardRepository.save(debitCard1)) {
        System.out.println(debitCard1.getAccount().getCustomer().getName() + " " + debitCard1.getAccount().getCustomer().getSurname() +" Debit card created.");
        } else {
        System.out.println("Because of existing ID, " + debitCard1.getAccount().getCustomer().getName() + " " + debitCard1.getAccount().getCustomer().getSurname() + " Debit card not created.");
        }
        debitCard1.deposit(1500);

        CreditCard creditCard1 = new CreditCard(123125, account1);
        creditCard1.setCreditLimit(5000);
        if (bankCardRepository.save(creditCard1)) {
            System.out.println(creditCard1.getAccount().getCustomer().getName() + " " + creditCard1.getAccount().getCustomer().getSurname() + " Credit card created.");
        } else {
            System.out.println("Because of existing ID, " + creditCard1.getAccount().getCustomer().getName() + " " + creditCard1.getAccount().getCustomer().getSurname() + " Credit card not created.");
        }
        creditCard1.spend(2000);
        creditCard1.spend(2000);
        creditCard1.setCreditLimit(8000);

        creditCard1.spend(2000);
        creditCard1.spend(2000);
        System.out.println(creditCard1.getAccount().getCustomer().getName() + " " + creditCard1.getAccount().getCustomer().getSurname() + " used credit limit: " + creditCard1.getUsedLimit() + ", remaining limit: " + (creditCard1.getCreditLimit() - creditCard1.getUsedLimit()));
   

    }
}