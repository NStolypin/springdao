package ru.esplit.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ru.esplit.dao.PersonDAO;
import ru.esplit.models.Person;

@Component
public class PersonValidator implements Validator{
    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
    
    @Override
    public boolean supports(@NonNull Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(@NonNull Object o, @NonNull Errors errors) {
        Person person = (Person) o;

        // if(personDAO.show(person.getEmail()).isPresent()) {
        //     errors.rejectValue("email", "", "This email is alredy taken");
        // }
    }
}
