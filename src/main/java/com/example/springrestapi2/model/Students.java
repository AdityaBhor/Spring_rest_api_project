package com.example.springrestapi2.model;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
@Entity
@Table(name="students")
public class Students {

    @Id

    @Column(name="studentsId")
    private int studentsId;
    @Column(name="studentsName")
    private String studentsName;
    @Column(name="studentsPhone")
    private long  studentsPhone;
    @Column(name="studentsAddress")
    private String studentsAddress;
}
