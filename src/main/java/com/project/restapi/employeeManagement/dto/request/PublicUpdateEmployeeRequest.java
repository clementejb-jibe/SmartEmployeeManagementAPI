package com.project.restapi.employeeManagement.dto.request;

import jakarta.validation.constraints.NotBlank;

public class PublicUpdateEmployeeRequest {
    @NotBlank
    private String name;
    private int age;
    @NotBlank
    private String email;
    @NotBlank
    private String position;

    public String getName() {
        return name;
    }

    public PublicUpdateEmployeeRequest setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PublicUpdateEmployeeRequest setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public PublicUpdateEmployeeRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public PublicUpdateEmployeeRequest setPosition(String position) {
        this.position = position;
        return this;
    }
}
