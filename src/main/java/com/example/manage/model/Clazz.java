package com.example.manage.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


@Table(name = "Clazz")
@Entity // đánh dấu table trong db
@Data  // lombok giúp generate các hàm constructor, get, set
@AllArgsConstructor
@NoArgsConstructor
public class Clazz {
    @Id // đánh dấu khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tự động tăng , notnull
    private Long id;

    @NotNull
    private String name;

    // Many to One Có nhiều lớp trong 1 trường .
    @ManyToOne
    private School school;
}
