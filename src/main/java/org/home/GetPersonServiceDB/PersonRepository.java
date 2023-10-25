package org.home.GetPersonServiceDB;

import java.util.Optional;

public interface PersonRepository {
    Optional<Person> getPersonById(int id);
}
