package com.example.careerconnecthub.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobTitle;
    @ManyToOne
    @JoinColumn(name = "employerId")
    private Employer employerId;
    private String companyName;
    private String requirements;
    private double salary;
}
