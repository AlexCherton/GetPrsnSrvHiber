package org.home.GetPersonServiceDB;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person getPerson(int personId) {
        return personRepository.getPersonById(personId)
                .orElseThrow(() -> new PersonNotFoundException(personId));
    }
}
