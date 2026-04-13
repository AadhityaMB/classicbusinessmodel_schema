package com.classicbusinessmodel_schema.backend.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
    @Table(name = "offices")
    public class Office {

        @Id
        private String officeCode;

        private String city;
        private String phone;
        private String addressLine1;
        private String addressLine2;
        private String state;
        private String country;
        private String postalCode;
        private String territory;
    }

