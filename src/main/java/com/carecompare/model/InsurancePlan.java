package com.carecompare.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
// import lombok.Data;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "insurance_plan")
// Prevent Jackson serialization errors for bidirectional relationships
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "hospitals"})
// @Data  // Removing Lombok annotation and adding explicit getters and setters
public class InsurancePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String provider;
    private String benefits;
    private String coverage;
    private String policyNumber;

    @ManyToMany(mappedBy = "acceptedPlans")
    private Set<Hospital> hospitals = new HashSet<>();

    public InsurancePlan() {}

    // Explicit getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Set<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(Set<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
}