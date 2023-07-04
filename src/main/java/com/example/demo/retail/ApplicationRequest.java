package com.example.demo.retail;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRequest {
        private String name;
        private String surname;
        private Integer identityNumber;
        private String address;
        private String phone;
        private String email;
        private String birthDay;
        private Boolean didRetail;
        private String whyUs;
        private String location;
        private Integer equityAmount;
        private String additionalInformation;

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
            if (additionalInformation == null){
                additionalInformation = "";
            }
            this.additionalInformation = additionalInformation;
        }
    }
