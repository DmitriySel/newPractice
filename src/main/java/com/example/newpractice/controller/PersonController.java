package com.example.newpractice.controller;

import com.example.newpractice.control.PersonControl;
import com.example.newpractice.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PersonController {

   private final PersonControl control;

   @PostMapping("add")
   public void savePerson(@RequestBody Person person){
       control.savePerson(person);
   }

   @GetMapping("get/{id}")
    public Person getPerson(@PathVariable String id){
       return control.getPerson(id);
   }
}
