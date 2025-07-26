package com.carecompare.repository;

import com.carecompare.model.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
    List<Treatment> findByHospitalId(Long hospitalId); 
}