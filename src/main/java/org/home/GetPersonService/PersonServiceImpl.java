package org.home.GetPersonService;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    public Person getPerson(int personId) {
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
}
