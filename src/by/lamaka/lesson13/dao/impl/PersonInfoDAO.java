package by.lamaka.lesson13.dao.impl;

import by.lamaka.lesson13.config.ConnectionDB;
import by.lamaka.lesson13.entity.Hobby;
import by.lamaka.lesson13.entity.Person;
import by.lamaka.lesson13.exception.DAOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonInfoDAO {
    public void savePersonInfo(Person person) throws DAOException {
        String sql1 = "SELECT * FROM person WHERE name=? AND sex=? AND date=?";
        String sql2 = "INSERT INTO person_info(person_id, hobby_id) VALUES(?,?)";
        int id = 0;
        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
             PreparedStatement preparedStatement2 = connection.prepareStatement(sql2)) {
            preparedStatement1.setString(1, person.getName());
            preparedStatement1.setBoolean(2, person.isSex());
            preparedStatement1.setDate(3, person.getDate());

            ResultSet resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()) {
                id = resultSet.getInt("id");
            }
            for (Hobby hobby : person.getHobbies()) {
                preparedStatement2.setInt(1, id);
                preparedStatement2.setInt(2, hobby.getId());
                preparedStatement2.addBatch();
            }
            preparedStatement2.executeBatch();

        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
    }

    public void deletePersonInfo(int id) throws DAOException {
        String sql1 = "DELETE FROM person_info WHERE person_id=?";
        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement1 = connection.prepareStatement(sql1)) {

            preparedStatement1.setInt(1, id);
            preparedStatement1.executeUpdate();

        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
    }

    public void updatePersonInfo(Person person) throws DAOException {
        String sql1 = "SELECT * FROM person WHERE name=? AND sex=? AND date=?";
        String sql2 = "INSERT INTO person_info(person_id, hobby_id) VALUES(?,?)";
        int id = 0;
        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
             PreparedStatement preparedStatement2 = connection.prepareStatement(sql2)) {

            preparedStatement1.setString(1, person.getName());
            preparedStatement1.setBoolean(2, person.isSex());
            preparedStatement1.setDate(3, person.getDate());

            ResultSet resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()) {
                id = resultSet.getInt("id");
            }
            deletePersonInfo(id);

            for (Hobby hobby : person.getHobbies()) {
                preparedStatement2.setInt(1, id);
                preparedStatement2.setInt(2, hobby.getId());
                preparedStatement2.addBatch();
            }
            preparedStatement2.executeBatch();

        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
    }
}
