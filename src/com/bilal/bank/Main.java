package com.bilal.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount ac101 = new BankAccount();
        ac101.setCustomerName("Bilal");
        ac101.setEmail("b@gmail.com");
        ac101.setPhoneNumber("79999999999");
        ac101.setAccountNumber("10000101");
        ac101.depositFunds(10000);
        ac101.withdrawFunds(1000);
        System.out.println(ac101.getBalance());
    }
}
