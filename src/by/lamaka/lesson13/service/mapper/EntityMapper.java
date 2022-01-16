package by.lamaka.lesson13.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface EntityMapper <T>{
    T map (ResultSet entity) throws SQLException;
}
