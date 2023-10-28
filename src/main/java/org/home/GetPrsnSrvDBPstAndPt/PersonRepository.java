package org.home.GetPrsnSrvDBPstAndPt;

import java.util.Optional;

public interface PersonRepository {
    Optional<Person> getPersonById(int id);

    void insertPerson(String firstName, String lastName, int age);

    void updatePerson(String firstName, String lastName, int age, int id);
}
