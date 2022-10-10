package com.example.manage.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Table(name = "Subject")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;


    //    @ManyToMany
//    @JoinTable(name = "Student_Subject",
//            joinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))
//    private Set<Student> students;

//    @ManyToMany(mappedBy = "subjects")
//    private Set<Student> students;

}
