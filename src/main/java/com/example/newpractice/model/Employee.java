package com.example.newpractice.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize(as = Employee.class)
@TypeAlias(Employee.TYPE)
public class Employee extends Person {
    static final String TYPE = "employee";
    private String work;
    private Double salary;
}
