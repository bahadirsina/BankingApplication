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
        System.out.println(customer3.getName() + " " + customer3.getSurname() +" müşterisi eklendi.");
        } else {
        System.out.println("Aynı ID bulunduğu için " + customer3.getName() + " " + customer3.getSurname() + " müşterisi eklenemedi.");
        }

        Account account1 = new Account(123456, customer2);
        account1.setActive(true);
        accountRepository.save(account1);
        Account account2 = new Account(123457, customer1);
        account2.setActive(true);
        if (accountRepository.save(account2)) {
        System.out.println(account2.getCustomer().getName() + " " + account2.getCustomer().getSurname() +" hesabı oluşturuldu.");
        } else {
        System.out.println("Aynı ID bulunduğu için " + account2.getCustomer().getName() + " " + account2.getCustomer().getSurname() + " hesap oluşturulamadı.");
        }

        DebitCard debitCard1 = new DebitCard(123123, account1);
        if (bankCardRepository.save(debitCard1)) {
        System.out.println(debitCard1.getAccount().getCustomer().getName() + " " + debitCard1.getAccount().getCustomer().getSurname() +" Debit kartı oluşturuldu.");
        } else {
        System.out.println("Aynı ID bulunduğu için " + debitCard1.getAccount().getCustomer().getName() + " " + debitCard1.getAccount().getCustomer().getSurname() + " Debit kartı oluşturulamadı.");
        }
        
    }
}