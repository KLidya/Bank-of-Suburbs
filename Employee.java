/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bank_of_suburbs;

public class Employee {
    private int eid;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String address;
    private EmployeeType empType;

    public Employee(int eid, String firstname, String lastname, String email, String phone, String address,
            EmployeeType empType) {
        this.eid = eid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.empType = empType;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeType getEmpType() {
        return empType;
    }

    public void setEmpType(EmployeeType empType) {
        this.empType = empType;
    }

    @Override
    public String toString() {
        return "Employee{" + "eid=" + eid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
                + ", phone=" + phone + ", address=" + address + ", empType=" + empType + '}';
    }

}
