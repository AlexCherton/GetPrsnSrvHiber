package org.home.GetPersonServiceDB;

import java.util.Objects;

public class Person {
    int id;
    String firstName;
    String lastNam;
    int age;

    public Person(int id, String firstName, String lastNam, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastNam = lastNam;
        this.age = age;
    }

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

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastNam(String lastNam) {
        this.lastNam = lastNam;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() && getAge() == person.getAge() && Objects.equals(getFirstName(),
                person.getFirstName()) && Objects.equals(getLastNam(), person.getLastNam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastNam(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastNam='" + lastNam + '\'' +
                ", age=" + age +
                '}';
    }
}
