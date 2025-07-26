package com.carecompare.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; 
    private String diagnosis;
    private String treatment;
    private Long patientId;
    private LocalDate date;

    public MedicalRecord() {}
}