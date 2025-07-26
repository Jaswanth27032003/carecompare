package com.carecompare.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double cost;
    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
    @ManyToOne
    @JoinColumn(name = "insurance_id")
    private InsurancePlan insurancePlan;

    public Treatment() {}
}