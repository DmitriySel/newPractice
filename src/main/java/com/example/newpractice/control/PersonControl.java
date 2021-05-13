package com.example.newpractice.control;

import com.example.newpractice.model.Person;
import com.example.newpractice.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonControl {

    private final PersonRepository repository;

    public Person getPerson(String id){
        return repository.findById(id).orElse(null);
    }

    public void savePerson(Person person){
        repository.save(person);
    }
}
