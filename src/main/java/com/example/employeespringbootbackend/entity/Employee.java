package com.example.employeespringbootbackend.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name") // Those are added to specify column name.
    private String lastName;
    private String email; //Column name hasn't been added as email bcz name of email is good as it is.

}
