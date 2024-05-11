/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.bank_of_suburbs;

public class PartTimeEmployee extends Employee {
    private int hours;
    private float hourlyrate;

    public PartTimeEmployee(int hours, float hourlyrate, int eid, String firstname, String lastname, String email,
            String phone, String address, EmployeeType empType) {
        super(eid, firstname, lastname, email, phone, address, empType);
        this.hours = hours;
        this.hourlyrate = hourlyrate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(float hourlyrate) {
        this.hourlyrate = hourlyrate;
    }

    @Override
    public String toString() {
        return "Employee{" + "eid=" + getEid() + ", firstname=" + getFirstname() + ", lastname=" + getLastname()
                + ", email=" + getEmail() + ", phone=" + getPhone() + ", address=" + getAddress() + ", empType="
                + getEmpType() + ",hours=" + hours + ", hourlyrate=" + hourlyrate + '}';

    }

}
