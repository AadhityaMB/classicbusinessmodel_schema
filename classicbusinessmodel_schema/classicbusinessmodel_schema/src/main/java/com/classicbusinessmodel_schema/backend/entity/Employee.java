package com.classicbusinessmodel_schema.backend.entity;

import jakarta.persistence.*;

@Entity
    @Table(name = "employees")
    public class Employee {

        @Id
        private Integer employeeNumber;

        private String lastName;
        private String firstName;
        private String email;
        private String jobTitle;

        @ManyToOne
        @JoinColumn(name = "officeCode")
        private Office office;

        @ManyToOne
        @JoinColumn(name = "reportsTo")
        private Employee manager;
    }

