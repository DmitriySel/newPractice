package com.example.newpractice.model;

import com.example.newpractice.control.Config;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize(using = Config.class)
@Document(collection = "person")
public abstract class Person {
    @Id
    private String id;
    private String type;
    private String name;
}
