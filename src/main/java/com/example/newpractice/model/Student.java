package com.example.newpractice.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize(as = Student.class)
@TypeAlias(Student.TYPE)
public class Student extends Person {
    static final String TYPE = "student";
    private String university;
    private Double scholarship;
}
