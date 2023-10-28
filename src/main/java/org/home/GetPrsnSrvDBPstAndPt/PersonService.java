package org.home.GetPrsnSrvDBPstAndPt;

public interface PersonService {
    Person getPerson(int personId);

    void createPerson(String firstName, String lastName, int age);

    void updatePerson(String firstName, String lastName, int age, int id);
}
