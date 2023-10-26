package org.home.GetPersonServiceDBPost;

import java.util.Optional;

public interface PersonRepository {
    Optional<Person> getPersonById(int id);

    void insertPerson(String firstName, String lastName, int age);
}
