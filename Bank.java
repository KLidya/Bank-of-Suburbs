/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bank_of_suburbs;

import java.util.ArrayList;

public class Bank {
    private String id;
    private String name;
    private String phone;
    private String address;
    ArrayList<Employee> employees;
    ArrayList<Customer> customers;

    public Bank(String id, String name, String phone, String address, ArrayList<Employee> employees,
            ArrayList<Customer> customers) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.employees = employees;
        this.customers = customers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Bank{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", employees="
                + employees + ", customers=" + customers + '}';
    }

}
