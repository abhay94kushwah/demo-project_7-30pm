package com.edusol.service;

import com.edusol.model.Employee_7AM;
import com.edusol.repository.EmployeejpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDBService {
    @Autowired
    EmployeejpaRepo repo;
    public String add(Employee_7AM employee_7AM){
        repo.save(employee_7AM);
        return "successfully add in DataBase";
    }
    public List<Employee_7AM> getAllEmployee(){
        return repo.findAll();
    }
    public String updateEmployee(Long id ,String name){
        Employee_7AM Employee_7AM=repo.getReferenceById(id);
        Employee_7AM.setName(name);
        repo.save(Employee_7AM);
        return "Successfully updated in DataBase"+name;
    }
    public String delete(Long id){
        repo.deleteById(id);
        return "Successfully deleted in DataBase";

    }
}
