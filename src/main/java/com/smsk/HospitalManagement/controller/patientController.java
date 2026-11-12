package com.smsk.HospitalManagement.controller;

import com.smsk.HospitalManagement.entity.patient;
import com.smsk.HospitalManagement.service.patientSer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class patientController {
    private final patientSer con;

    @GetMapping("/getall")
    public List<patient>getall(){
        return con.getall();
    }

    @GetMapping("/getbyid/{id}")
    public patient getbyid(@PathVariable Long id){
        return con.getbyId(id);
    }

    @PostMapping("/add")
    public patient add(@RequestBody patient data){
        return con.add(data);
    }

    @PutMapping("/update/{id}")
    public patient update(@RequestBody patient new_data,@PathVariable Long id){
        return con.update(id,new_data);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        con.delete(id);
    }
}
