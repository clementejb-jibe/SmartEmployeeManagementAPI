package com.project.restapi.employeeManagement.dto.request;

import jakarta.validation.constraints.NotBlank;

public class AdminCreateEmployeeRequest {
    @NotBlank
    private String name;

    private Integer age;

    @NotBlank
    private String position;

    private Double salary;

    @NotBlank
    private String email;

    private boolean isActive;

    public boolean active() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
