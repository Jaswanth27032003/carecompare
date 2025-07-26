package com.carecompare.repository;

import com.carecompare.model.InsurancePlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InsurancePlanRepository extends JpaRepository<InsurancePlan, Long> {
    Optional<InsurancePlan> findByPolicyNumber(String policyNumber); // Add this method
}