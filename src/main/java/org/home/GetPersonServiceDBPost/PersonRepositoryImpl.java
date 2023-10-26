package org.home.GetPersonServiceDBPost;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
    private static final String SQL_GET_PERSON_BY_ID =
            "select id, first_name, last_name, age from peron where id = :id";

    private static final String SQL_INSERT_PERSON =
            "insert into person (first_name, last_name, age) " +
                    "values (:firstName, :lastName, :age)";

    private final PersonMapper personMapper;
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public PersonRepositoryImpl(
            PersonMapper personMapper,
            NamedParameterJdbcTemplate jdbcTemplate
    ) {
        this.personMapper = personMapper;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Optional<Person> getPersonById(int id) {
        var params = new MapSqlParameterSource();
        params.addValue("id", id);
        return jdbcTemplate.query(
                SQL_GET_PERSON_BY_ID,
                params,
                personMapper
        ).stream()
                .findFirst();
    }

    @Override
    public void insertPerson(String firstName, String lastName, int age) {
        var params = new MapSqlParameterSource();
        params.addValue("firstName", firstName);
        params.addValue("lastNam", lastName);
        params.addValue("age", age);
        jdbcTemplate.update(SQL_INSERT_PERSON,params);
    }
}
