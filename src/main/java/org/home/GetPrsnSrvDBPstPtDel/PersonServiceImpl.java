package org.home.GetPrsnSrvDBPstPtDel;

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

    @Override
    public void updatePerson(String firstName, String lastName, int age, int id) {
        var person = personRepository.getPersonById(id).orElseThrow(() -> new PersonNotFoundException(id));
        personRepository.updatePerson(firstName, lastName,age, person.getId());
    }

    @Override
    public void deletePerson(int id) {
        var person = personRepository.getPersonById(id).orElseThrow(() -> new PersonNotFoundException(id));
        personRepository.deletePerson(person.getId());
    }
}
