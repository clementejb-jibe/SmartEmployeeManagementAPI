package com.project.restapi.employeeManagement.dto.response;

public class AdminEmployeeResponse {
    private Long id;
    private String name;
    private String email;
    private int age;
    private Double salary;
    private String position;
    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public AdminEmployeeResponse setActive(boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getId() {
        return id;
    }

    public AdminEmployeeResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AdminEmployeeResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AdminEmployeeResponse setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getAge() {
        return age;
    }

    public AdminEmployeeResponse setAge(int age) {
        this.age = age;
        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public AdminEmployeeResponse setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public AdminEmployeeResponse setPosition(String position) {
        this.position = position;
        return this;
    }
}
