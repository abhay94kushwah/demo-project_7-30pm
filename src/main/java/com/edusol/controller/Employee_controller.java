package com.edusol.controller;

import com.edusol.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Employee_controller {
    ArrayList<Employee> EmployeeList= new ArrayList<>();
//create
    @RequestMapping(value= "/addone",method= RequestMethod.POST)
    public String addemployee(){
        Employee employee=new Employee("Abhay",234,"CS");
        EmployeeList.add(employee);
        return "Employee added";
    }
    @RequestMapping(value= "/get_all",method= RequestMethod.GET)
    public ArrayList<Employee> getEmployeeList(){
        return EmployeeList;
    }
    @RequestMapping(value= "/updated",method=RequestMethod.PUT)
    public String updateEmployee(@RequestParam String name){
        EmployeeList.get(0).setName(name);
        return "Update added..."+name;
    }
    @RequestMapping(value= "/removing",method=RequestMethod.DELETE)
    public String remove(@RequestParam int index){
        EmployeeList.remove(index);
        return "removal success...";
    }
}
