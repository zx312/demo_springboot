package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Component
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name",nullable = true,length = 20)
    private String name;
    @Column(name = "age",nullable = true,length = 3)
    private String age;
}
