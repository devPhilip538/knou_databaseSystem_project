package com.knoudb.term.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    private String name;
    private int age;
    private String address;
    @CreationTimestamp
    private Date createdAt;

    // Constructor
    public Member(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}