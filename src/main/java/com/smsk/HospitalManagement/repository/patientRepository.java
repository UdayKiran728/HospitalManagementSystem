package com.smsk.HospitalManagement.repository;

import com.smsk.HospitalManagement.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientRepository extends JpaRepository<patient, Long>
{
}
