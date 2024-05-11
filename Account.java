/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bank_of_suburbs;

import java.util.ArrayList;

public class Account {
    private String id;
    private AccountType accType;
    private float balance;
    ArrayList<Transaction> transactions;

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", accType=" + accType + ", balance=" + balance + ", transactions="
                + transactions + '}';
    }

    Account() {

    }

    public Account(String id, AccountType accType, float balance, ArrayList<Transaction> transactions) {
        this.id = id;
        this.accType = accType;
        this.balance = balance;
        this.transactions = transactions;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccountType getAccType() {
        return accType;
    }

    public void setAccType(AccountType accType) {
        this.accType = accType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
