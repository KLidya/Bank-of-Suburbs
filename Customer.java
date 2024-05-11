/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bank_of_suburbs;

import java.util.ArrayList;

public class Customer {
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String uname;
    private String pass;
    private CustomerType custType;
    ArrayList<Account> accounts;

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
                + ", phone=" + phone + ", uname=" + uname + ", pass=" + pass + ", custType=" + custType + ", accounts="
                + accounts + '}';
    }

    Customer() {

    }

    public Customer(String id, String firstname, String lastname, String email, String phone, String uname, String pass,
            CustomerType custType, ArrayList<Account> accounts) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.uname = uname;
        this.pass = pass;
        this.custType = custType;
        this.accounts = accounts;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CustomerType getCustType() {
        return custType;
    }

    public void setCustType(CustomerType custType) {
        this.custType = custType;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
