package mongodb.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mongodb.example.entity.PersonEntity;
import mongodb.example.repository.PersonRepository;

@RestController
@RequestMapping("/mongodb")
public class PersonController {
    
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/getAllPersons")
    public List<PersonEntity> getAllPersons(){
        return personRepository.findAll();
    }
}
