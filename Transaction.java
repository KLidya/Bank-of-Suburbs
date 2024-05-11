/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bank_of_suburbs;

import java.time.LocalDateTime;

public class Transaction {
    private String tid;
    private TransactionType transactionType;
    private float tamount;
    private LocalDateTime tdatetime;

    @Override
    public String toString() {
        return "Transaction{" + "tid=" + tid + ", transactionType=" + transactionType + ", tamount=" + tamount
                + ", tdatetime=" + tdatetime + '}';
    }

    public Transaction() {
    }

    public Transaction(String tid, TransactionType transactionType, float tamount, LocalDateTime tdatetime) {
        this.tid = tid;
        this.transactionType = transactionType;
        this.tamount = tamount;
        this.tdatetime = tdatetime;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public float getTamount() {
        return tamount;
    }

    public void setTamount(float tamount) {
        this.tamount = tamount;
    }

    public LocalDateTime getTdatetime() {
        return tdatetime;
    }

    public void setTdatetime(LocalDateTime tdatetime) {
        this.tdatetime = tdatetime;
    }

}
