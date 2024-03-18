package ru.netology.tableusers.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.netology.tableusers.entity.Person;

import java.util.List;

@AllArgsConstructor
@Repository
public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("select p from Person p where p.cityOfLiving = :city order by p.cityOfLiving", Person.class).setParameter("city", city).getResultList();
    }
}
