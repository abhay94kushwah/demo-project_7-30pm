package com.edusol.repository;

import com.edusol.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class AppArchRepo {
    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public String addemployee() {
        Employee employee = new Employee("Abhay", 456, "CS");
        employeeArrayList.add(employee);
        return "Employee added by repository...";
    }
}