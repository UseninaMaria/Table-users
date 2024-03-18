package ru.netology.tableusers.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.tableusers.entity.Person;
import ru.netology.tableusers.repository.PersonRepository;

import java.util.List;
@RestController
@AllArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;

    @GetMapping("/persons/by-city")
    public List<Person> getPersons(@RequestParam String city) {
        return personRepository.getPersonsByCity(city);
    }
}
