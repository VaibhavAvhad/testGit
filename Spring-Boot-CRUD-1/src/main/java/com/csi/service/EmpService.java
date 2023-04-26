package com.csi.service;

import com.csi.dao.EmpDao;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    EmpDao empDaoImpl;

    public Employee saveData(Employee employee) {
        return empDaoImpl.saveData(employee);
    }

    public List<Employee> getAllData() {
        return empDaoImpl.getAllData();

    }

    public Optional<Employee>getDataById(int empId){
        return empDaoImpl.getDataById(empId);
    }

    public  Employee updateData(Employee employee){
        return  empDaoImpl.updateData(employee);
    }

    public void  deleteDataById(int empId){
        empDaoImpl.deleteById(empId);
    }
}
