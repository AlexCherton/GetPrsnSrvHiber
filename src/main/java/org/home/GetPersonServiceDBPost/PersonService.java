package org.home.GetPersonServiceDBPost;

public interface PersonService {
    Person getPerson(int personId);

    void createPerson(String firstName, String lastName, int age);
}
