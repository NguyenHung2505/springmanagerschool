package com.example.manage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "Student_Subject")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double point;

    @ManyToOne
    private Student studentId;

    @ManyToOne
    private Subject subjectId;
}
