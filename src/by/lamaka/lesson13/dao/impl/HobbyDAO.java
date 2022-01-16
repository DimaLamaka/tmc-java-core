package by.lamaka.lesson13.dao.impl;

import by.lamaka.lesson13.config.ConnectionDB;
import by.lamaka.lesson13.dao.DAOProvider;
import by.lamaka.lesson13.dao.EntityDAO;
import by.lamaka.lesson13.entity.Hobby;
import by.lamaka.lesson13.exception.DAOException;
import by.lamaka.lesson13.service.mapper.EntityMapper;
import by.lamaka.lesson13.service.mapper.MapperService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HobbyDAO implements EntityDAO<Hobby> {

    @Override
    public void save(Hobby hobby) throws DAOException {
        String sql = "INSERT INTO hobby(name,type_id) VALUES(?,?)";

        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, hobby.getName());
            preparedStatement.setInt(2, hobby.getType().equalsIgnoreCase("calm") ? 2 : 1);

            preparedStatement.executeUpdate();
        }
        catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
    }

    @Override
    public void saveAll(List<Hobby> hobbies) throws DAOException {
        String sql = "INSERT INTO hobby(name,type_id) VALUES(?,?)";

        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            for (Hobby hobby : hobbies) {
                preparedStatement.setString(1, hobby.getName());
                preparedStatement.setInt(2, hobby.getType().equalsIgnoreCase("calm") ? 2 : 1);
                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch();
        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
    }

    @Override
    public void update(Hobby hobby) throws DAOException {
        String sql = "UPDATE hobby SET name=?,type_id=? WHERE id = ?";

        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, hobby.getName());
            preparedStatement.setInt(2, hobby.getType().equalsIgnoreCase("calm") ? 2 : 1);
            preparedStatement.setInt(3, hobby.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
    }

    @Override
    public void delete(int id) throws DAOException {
        String sql = "DELETE FROM hobby WHERE id = ?";

        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
    }

    @Override
    public Hobby get(int id) throws DAOException {
        String sql = "SELECT h.id as hobby_id, h.name as hobby_name, ht.name as hobby_type_name " +
                "FROM hobby h " +
                "JOIN hobby_type ht on h.type_id = ht.id " +
                "WHERE h.id = ?";
        Hobby hobby = null;
        EntityMapper<Hobby> hobbyEntityMapper = MapperService.getInstance().getHobbyEntityMapper();

        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                hobby = hobbyEntityMapper.map(resultSet);
            }
        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
        return hobby;
    }

    @Override
    public List<Hobby> getAll() throws DAOException {
        String sql = "SELECT h.id as hobby_id, h.name as hobby_name, ht.name as hobby_type_name " +
                "FROM hobby h " +
                "JOIN hobby_type ht on h.type_id = ht.id ";
        List<Hobby> hobbies = new ArrayList<>();
        Hobby hobby = null;
        EntityMapper<Hobby> hobbyEntityMapper = MapperService.getInstance().getHobbyEntityMapper();

        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                hobby = hobbyEntityMapper.map(resultSet);
                hobbies.add(hobby);
            }
        }
        catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
        return hobbies;
    }
}