package ru.esplit.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ru.esplit.models.Person;

@Component
public class PersonDAO {

    private final SessionFactory sessionFactory;


    @Autowired
    public PersonDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    public List<Person> index() {
        Session session = sessionFactory.getCurrentSession();

        List<Person> people = session.createQuery("Select p FROM Person p", Person.class)
        .getResultList();

        return people;
    }

    public Optional<Person> show(String email) {
        return null;
    }

    public Person show(int id) {
        return null;
    }

    public void save(Person person) {
        
    }

    public void update(int id, Person updatedPerson) {
       
    }

    public void delete(int id) {
        
    }

    /////////////////////////////////
    /// Тестируем производительность пакетной вставки
    /////////////////////////////////

    public void testMultiplateUpdate() {
        
    }

    public void testBatchUpdate() {
        
    }

    private List<Person> create1000People() {
        return null;
    }
}
