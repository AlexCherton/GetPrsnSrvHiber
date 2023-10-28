package org.home.GetPrsnSrvDBPstAndPt;

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

    @Override
    public void createPerson(String firstName, String lastName, int age) {
        personRepository.insertPerson(firstName, lastName,age);
    }
}
