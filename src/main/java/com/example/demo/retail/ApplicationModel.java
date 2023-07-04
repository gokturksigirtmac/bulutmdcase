package com.example.demo.retail;

import jakarta.persistence.*;
@Entity
@Table(name = "retailApplication")
public class ApplicationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "identityNumber", nullable = false)
    private Integer identityNumber;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "birthDay", nullable = false)
    private String birthDay;
    @Column(name = "hasRetailExperience", nullable = false)
    private Boolean didRetail;
    @Column(name = "whyUs", nullable = false)
    private String whyUs;
    @Column(name = "location", nullable = false)
    private String location;
    @Column(name = "equityAmount", nullable = false)
    private Integer equityAmount;
    @Column(name = "additionalInformation")
    private String additionalInformation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(Integer identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Boolean getDidRetail() {
        return didRetail;
    }

    public void setDidRetail(Boolean didRetail) {
        this.didRetail = didRetail;
    }

    public String getWhyUs() {
        return whyUs;
    }

    public void setWhyUs(String whyUs) {
        this.whyUs = whyUs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getEquityAmount() {
        return equityAmount;
    }

    public void setEquityAmount(Integer equityAmount) {
        this.equityAmount = equityAmount;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }
}
