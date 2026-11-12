package com.smsk.HospitalManagement.service;

import com.smsk.HospitalManagement.entity.patient;
import com.smsk.HospitalManagement.repository.patientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class patientSer {
    private final patientRepository Ser;
    public patient getbyId(Long id){
       return Ser.findById(id).orElseThrow(()-> new RuntimeException("id not found"));
    }

    public List<patient> getall(){
        return Ser.findAll();
    }

    public patient add(patient data){
        return Ser.save(data);
    }

    public patient update(Long id, patient new_data){
        patient old_id = Ser.findById(id).orElseThrow(()-> new RuntimeException("id not found"));
        old_id.setName(new_data.getName());
        old_id.setAadhar(new_data.getAadhar());
        old_id.setAge(new_data.getAge());
        old_id.setBlood_group(new_data.getBlood_group());
        old_id.setEmail(new_data.getEmail());
        old_id.setNumber(new_data.getNumber());
        old_id.setGender(new_data.getGender());
        old_id.setPatientCode(new_data.getPatientCode());

        return Ser.save(old_id);

    }

    public void delete(Long id){
        Ser.deleteById(id);
        System.out.println("id has beem deleted" + id);
    }
}
