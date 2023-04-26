package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(    )
public class EmpController {
    @Autowired
    EmpService empServiceImpl;

    @PostMapping("/savedata")
   public ResponseEntity<Employee>saveData(@RequestBody Employee employee){
       return ResponseEntity.ok(empServiceImpl.saveData(employee));
    }

    @GetMapping("/getalldata")
    public  ResponseEntity<List<Employee>>getAllData(){
     return    ResponseEntity.ok(empServiceImpl.getAllData());

    }

    @GetMapping("/getdatabyid/{empId}")
    public  ResponseEntity<Optional<Employee>>getDataById(@PathVariable int empId){
      return   ResponseEntity.ok(empServiceImpl.getDataById(empId));
    }

    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<Employee>updateData(@PathVariable int empId, @RequestBody Employee employee){
      return   ResponseEntity.ok(empServiceImpl.updateData(employee));
    }

    @DeleteMapping("/deletedata/{empId}")
    public  ResponseEntity<String>deleteDataById(@PathVariable int empId){
        empServiceImpl.deleteDataById(empId);
       return  ResponseEntity.ok( "data deleted successfully");

    }
}
