package com.edusol.controller;
import com.edusol.model.Employee_7AM;
import com.edusol.service.EmployeeDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDBcontroller {
    @Autowired
    EmployeeDBService service;
    //create or read
    @PostMapping("/employee_db")
    public String add(@RequestBody Employee_7AM employee_7AM){
        return service.add(employee_7AM);
    }
    //get
    @GetMapping("getall_employee")
    public List<Employee_7AM> getAllEmployee(){
        return service.getAllEmployee();
    }
    //update
    @PutMapping("employee_updated")
    public String updateEmployee(@RequestParam Long id,@RequestParam String name){
        return service.updateEmployee(id,name);

    }
    @DeleteMapping("delete_employee")
    public String delete(@RequestParam Long id){
        return service.delete(id);

    }
    }


