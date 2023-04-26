package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmpDao {

    @Autowired
    EmpRepo empRepoImpl;

    public Employee saveData(Employee employee) {
        return empRepoImpl.save(employee);
    }

    public List<Employee> getAllData() {
        return empRepoImpl.findAll();
    }

    public Optional<Employee> getDataById(int empId) {
        return empRepoImpl.findById(empId);
    }

    public Employee updateData(Employee employee) {
        return empRepoImpl.save(employee);
    }

    public void deleteById(int empId) {
        empRepoImpl.deleteById(empId);

    }
}
