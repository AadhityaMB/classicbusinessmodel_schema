package com.classicbusinessmodel_schema.backend.entity;

import jakarta.persistence.*;


@Entity
    @Table(name = "customers")
    public class Customer {

        @Id
        private Integer customerNumber;

        private String customerName;
        private String contactLastName;
        private String contactFirstName;
        private String phone;
        private String addressLine1;
        private String addressLine2;
        private String city;
        private String state;
        private String postalCode;
        private String country;
        private Double creditLimit;

        @ManyToOne
        @JoinColumn(name = "salesRepEmployeeNumber")
        private Employee employee;
    }

