package com.carecompare.repository;

import com.carecompare.model.InsurancePlan; // Add this import
import com.carecompare.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    List<Hospital> findByAcceptedPlansContaining(InsurancePlan plan); // Example method
    List<Hospital> findByStateContainingIgnoreCase(String state);
}