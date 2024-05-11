/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bank_of_suburbs;

public class FullTimeEmployee extends Employee {
    private float salary;

    public FullTimeEmployee(float salary, int eid, String firstname, String lastname, String email, String phone,
            String address, EmployeeType empType) {
        super(eid, firstname, lastname, email, phone, address, empType);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "eid=" + getEid() + ", firstname=" + getFirstname() + ", lastname=" + getLastname()
                + ", email=" + getEmail() + ", phone=" + getPhone() + ", address=" + getAddress() + ", empType="
                + getEmpType() + ",salary=" + salary + '}';
    }

}
