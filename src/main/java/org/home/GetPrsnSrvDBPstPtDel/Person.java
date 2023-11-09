package org.home.GetPrsnSrvDBPstPtDel;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String firstName;
    String lastNam;
    int age;

    @OneToMany(mappedBy = "language_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Language> languageList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNam() {
        return lastNam;
    }

    public void setLastNam(String lastNam) {
        this.lastNam = lastNam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Language> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<Language> languageList) {
        this.languageList = languageList;
    }
}
