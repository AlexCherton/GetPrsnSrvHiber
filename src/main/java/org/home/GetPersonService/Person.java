package org.home.GetPersonService;

import java.util.Objects;

public class Person {
    int id;
    String firstName;
    String lastNam;

    public Person(int id, String firstName, String lastNam) {
        this.id = id;
        this.firstName = firstName;
        this.lastNam = lastNam;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNam() {
        return lastNam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastNam(), person.getLastNam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastNam());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastNam='" + lastNam + '\'' +
                '}';
    }
}
