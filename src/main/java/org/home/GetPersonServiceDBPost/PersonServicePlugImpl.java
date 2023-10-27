package org.home.GetPersonServiceDBPost;

import org.springframework.stereotype.Service;

@Service
public class PersonServicePlugImpl implements PersonService {
    @Override
    public Person getPerson(int personId) {
        // имитируем обращение к БД
        if (personId == 123) {
            return new Person(
                    personId,
                    "Иван",
                    "Иванов"
            );
        } else {
            throw new PersonNotFoundException(personId);
        }
    }

    @Override
    public void createPerson(String firstName, String lastName, int age) {
    }
}
