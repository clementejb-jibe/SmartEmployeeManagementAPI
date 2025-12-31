package com.project.restapi.employeeManagement.dto.request;

import jakarta.validation.constraints.NotBlank;

public class AdminUpdateEmployeeRequest {
    @NotBlank
    private String name;
    private int age;
    @NotBlank
    private String position;
    @NotBlank
    private String email;

    private Double salary;

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

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setDepartment(String position) {
        this.position = this.position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
