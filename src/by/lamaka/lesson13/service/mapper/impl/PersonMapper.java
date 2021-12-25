package by.lamaka.lesson13.service.mapper.impl;

import by.lamaka.lesson13.entity.Person;
import by.lamaka.lesson13.service.mapper.EntityMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements EntityMapper<Person> {
    @Override
    public Person map(ResultSet person) throws SQLException {
        return Person.builder()
                .id(person.getInt("person_id"))
                .name(person.getString("person_name"))
                .sex(person.getBoolean("person_sex"))
                .date(person.getDate("person_date"))
                .build();
    }
}
