package by.lamaka.lesson13.service.mapper.impl;

import by.lamaka.lesson13.entity.Hobby;
import by.lamaka.lesson13.service.mapper.EntityMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HobbyMapper implements EntityMapper<Hobby> {
    @Override
    public Hobby map(ResultSet entity) throws SQLException {
        return Hobby.builder()
                .id(entity.getInt("hobby_id"))
                .name(entity.getString("hobby_name"))
                .type(entity.getString("hobby_type_name"))
                .build();
    }
}
