package com.bilal.bank;

public class BankAccount {
    private String customerName, email, accountNumber, phoneNumber;
    private double balance;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean depositFunds(double depositAmount) {
        if (depositAmount > 0) {
            this.balance = this.balance + depositAmount;
            return true;
        }
        return false;
    }

    public boolean withdrawFunds(double withdrawAmount) {
        if (withdrawAmount > 0) {
            this.balance = this.balance - withdrawAmount;
            return true;
        }
        return false;
    }
}
