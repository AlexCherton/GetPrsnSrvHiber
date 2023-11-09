package org.home.GetPrsnSrvHiber;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonDao {

    EntityManager entityManager;

    public List<Person> getAll() {
        return entityManager.createQuery("from person p order by p.id",Person.class)
                .getResultList();
    }

    public Person getPersonById(int id){
        return entityManager.find(Person.class,id);
    }
}
