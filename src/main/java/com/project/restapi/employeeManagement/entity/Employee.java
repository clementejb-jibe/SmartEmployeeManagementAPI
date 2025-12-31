package com.project.restapi.employeeManagement.entity;

import com.project.restapi.employeeManagement.exceptions.InvalidAgeException;
import com.project.restapi.employeeManagement.exceptions.InvalidSalaryException;
import jakarta.persistence.*;
import org.springframework.context.annotation.Configuration;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    @Column(name = "employee_Email", unique = true)
    private String email;


    private int age;


    private Double salary;


    private String position;

    private boolean isActive;


    public boolean isActive() {
        return isActive;
    }

    public Employee setIfActive(boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;

        if (age < 18) {
            throw new InvalidAgeException("Age must be above 18.");
        }

        if (age >= 60) {
            this.isActive = false;
        }

        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public Employee setSalary(Double salary) {
        this.salary = salary;

        if (salary <= 0) {
            throw new InvalidSalaryException("Salary must be above 0.");
        }

        return this;
    }

    public String getPosition() {
        return position;
    }

    public Employee setPosition(String position) {
        this.position = position;
        return this;
    }
}
