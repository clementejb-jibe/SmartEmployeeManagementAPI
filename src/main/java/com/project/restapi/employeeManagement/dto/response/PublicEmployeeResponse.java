package com.project.restapi.employeeManagement.dto.response;

public class PublicEmployeeResponse {
    private Long id;
    private String name;
    private String email;
    private int age;
    private String position;

    public Long getId() {
        return id;
    }

    public PublicEmployeeResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PublicEmployeeResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public PublicEmployeeResponse setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PublicEmployeeResponse setAge(int age) {
        this.age = age;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public PublicEmployeeResponse setPosition(String position) {
        this.position = position;
        return this;
    }
}
