package com.project.restapi.employeeManagement.dto.mapper;

import com.project.restapi.employeeManagement.dto.request.AdminCreateEmployeeRequest;
import com.project.restapi.employeeManagement.dto.request.AdminUpdateEmployeeRequest;
import com.project.restapi.employeeManagement.dto.request.PublicCreateEmployeeRequest;
import com.project.restapi.employeeManagement.dto.request.PublicUpdateEmployeeRequest;
import com.project.restapi.employeeManagement.dto.response.AdminEmployeeResponse;
import com.project.restapi.employeeManagement.dto.response.PublicEmployeeResponse;
import com.project.restapi.employeeManagement.entity.Employee;

import java.util.List;

public class EmployeeMapper {

    //@ADMIN
    public static Employee AdminFromCreateRequest(AdminCreateEmployeeRequest req) {
         return new Employee()
                .setName(req.getName())
                .setEmail(req.getEmail())
                .setAge(req.getAge())
                .setSalary(req.getSalary())
                .setIfActive(req.active())
                .setPosition(req.getPosition());
    }

    public static List<Employee> AdminFromCreateRequestList(List<AdminCreateEmployeeRequest> req) {
        return req.stream()
                .map(EmployeeMapper::AdminFromCreateRequest)
                .toList();
    }

    public static Employee AdminFromUpdateRequest(Employee emp, AdminUpdateEmployeeRequest req) {
        emp.setSalary(req.getSalary())
                .setName(req.getName())
                .setEmail(req.getEmail())
                .setAge(req.getAge())
                .setPosition(req.getPosition())
                .setIfActive(req.active());
        return emp;
    }

    public static AdminEmployeeResponse AdminToResponse(Employee emp) {
        return new AdminEmployeeResponse()
                .setId(emp.getId())
                .setName(emp.getName())
                .setEmail(emp.getEmail())
                .setSalary(emp.getSalary())
                .setAge(emp.getAge())
                .setActive(emp.isActive())
                .setPosition(emp.getPosition());
    }


    //@PUBLIC
    public static Employee publicFromCreateRequest(PublicCreateEmployeeRequest publicCreateRequest) {
        return new Employee()
                .setName(publicCreateRequest.getName())
                .setEmail(publicCreateRequest.getEmail())
                .setAge(publicCreateRequest.getAge())
                .setPosition(publicCreateRequest.getPosition());
    }

    public static Employee publicFromUpdateRequest(Employee emp, PublicUpdateEmployeeRequest req) {
        return emp
                .setName(req.getName())
                .setEmail(req.getEmail())
                .setAge(req.getAge())
                .setPosition(req.getPosition());
    }

    public static PublicEmployeeResponse publicToResponse(Employee emp) {
        return new PublicEmployeeResponse()
                .setId(emp.getId())
                .setName(emp.getName())
                .setEmail(emp.getEmail())
                .setAge(emp.getAge())
                .setPosition(emp.getPosition());

    }

}
