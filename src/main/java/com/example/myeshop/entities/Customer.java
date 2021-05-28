package com.example.myeshop.entities;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customernumber;
    private String customername;
    private String contactlastname;
    private String contactfirstname;
    private int phone;
    private String addressline1;
    private String addressline2;
    private String city;
    private String state;
    private int postalcode;
    private String country;
    private int salesrepemployeenumber;
    private int credlimit;


    public Long getCustomernumber() {
        return customernumber;
    }

    public void setCustomernumber(Long customerNumber) {
        this.customernumber = customerNumber;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customerName) {
        this.customername = customerName;
    }

    public String getContactlastname() {
        return contactlastname;
    }

    public void setContactlastname(String contactLastName) {
        this.contactlastname = contactLastName;
    }

    public String getContactfirstname() {
        return contactfirstname;
    }

    public void setContactfirstname(String contactFirstName) {
        this.contactfirstname = contactFirstName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressLine1) {
        this.addressline1 = addressLine1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String getAddressLine2) {
        this.addressline2 = getAddressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(int postalCode) {
        this.postalcode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSalesrepemployeenumber() {
        return salesrepemployeenumber;
    }

    public void setSalesrepemployeenumber(int salesRepEmployeeNumber) {
        this.salesrepemployeenumber = salesRepEmployeeNumber;
    }

    public int getCredlimit() {
        return credlimit;
    }

    public void setCredlimit(int credLimit) {
        this.credlimit = credLimit;
    }
}
