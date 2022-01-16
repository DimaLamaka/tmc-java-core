package by.lamaka.lesson13.dao.impl;

import by.lamaka.lesson13.config.ConnectionDB;
import by.lamaka.lesson13.dao.DAOProvider;
import by.lamaka.lesson13.dao.EntityDAO;
import by.lamaka.lesson13.entity.Hobby;
import by.lamaka.lesson13.entity.Person;
import by.lamaka.lesson13.exception.DAOException;
import by.lamaka.lesson13.service.mapper.MapperService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonDAO implements EntityDAO<Person> {

    @Override
    public void save(Person person) throws DAOException {
        String sql1 = "INSERT INTO person (name,sex,date) VALUES(?,?,?)";
        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement1 = connection.prepareStatement(sql1)) {
            preparedStatement1.setString(1, person.getName());
            preparedStatement1.setBoolean(2, person.isSex());
            preparedStatement1.setDate(3, person.getDate());
            preparedStatement1.executeUpdate();

            DAOProvider.getInstance().getPersonInfoDAO().savePersonInfo(person);
        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
    }

    @Override
    public void saveAll(List<Person> persons) throws DAOException {
        String sql1 = "INSERT INTO person (name,sex,date) VALUES(?,?,?)";
        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement1 = connection.prepareStatement(sql1)) {
            for (Person person : persons) {
                preparedStatement1.setString(1, person.getName());
                preparedStatement1.setBoolean(2, person.isSex());
                preparedStatement1.setDate(3, person.getDate());

                DAOProvider.getInstance().getPersonInfoDAO().savePersonInfo(person);
                preparedStatement1.addBatch();
            }
            preparedStatement1.executeBatch();
        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
    }

    @Override
    public void update(Person person) throws DAOException {
        String sql1 = "UPDATE person SET name=?,sex=?,date=? WHERE id=?";

        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement1 = connection.prepareStatement(sql1)) {

            preparedStatement1.setString(1, person.getName());
            preparedStatement1.setBoolean(2, person.isSex());
            preparedStatement1.setDate(3, person.getDate());
            preparedStatement1.setInt(4, person.getId());
            preparedStatement1.executeUpdate();

            DAOProvider.getInstance().getPersonInfoDAO().updatePersonInfo(person);
        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
    }

    @Override
    public void delete(int id) throws DAOException {
        String sql1 = "DELETE FROM person WHERE id=?";

        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement1 = connection.prepareStatement(sql1)) {

            preparedStatement1.setInt(1, id);
            preparedStatement1.executeUpdate();

            DAOProvider.getInstance().getPersonInfoDAO().deletePersonInfo(id);
        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
    }

    @Override
    public Person get(int id) throws DAOException {
        String sql1 = "SELECT p.id as person_id, p.name as person_name, p.sex as person_sex, p.date as person_date " +
                "FROM person p WHERE id = ?";
        String sql2 = "SELECT pi.person_id as person_id, h.id as hobby_id, h.name as hobby_name, ht.name as hobby_type_name " +
                "FROM person_info pi " +
                "JOIN hobby h on pi.hobby_id = h.id " +
                "JOIN hobby_type ht on h.type_id = ht.id " +
                "WHERE person_id = ?";

        Person person = null;
        List<Hobby> hobbies = new ArrayList<>();

        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
             PreparedStatement preparedStatement2 = connection.prepareStatement(sql2)) {

            preparedStatement1.setInt(1, id);
            preparedStatement2.setInt(1, id);
            ResultSet resultSet1 = preparedStatement1.executeQuery();
            ResultSet resultSet2 = preparedStatement2.executeQuery();
            MapperService mapperService = MapperService.getInstance();

            while (resultSet2.next()) {
                hobbies.add(mapperService.getHobbyEntityMapper().map(resultSet2));
            }

            if (resultSet1.next()) {
                person = mapperService.getPersonEntityMapper().map(resultSet1);
                person.setHobbies(hobbies);
            }
        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }

        return person;
    }

    @Override
    public List<Person> getAll() throws DAOException {
        String sql = "SELECT p.id as person_id, p.name as person_name, p.sex as person_sex, p.date as person_date, " +
                "h.id as hobby_id, h.name as hobby_name, " +
                "ht.name  as hobby_type_name " +
                "FROM person p " +
                "left join person_info pi ON pi.person_id = p.id " +
                "left JOIN hobby h on pi.hobby_id = h.id " +
                "left JOIN hobby_type ht on h.type_id = ht.id " +
                "order by p.id ";
        List<Person> persons = new ArrayList<>();
        List<Hobby> hobbies = new ArrayList<>();
        Hobby hobby = null;
        Person person = null;
        MapperService mapperService = MapperService.getInstance();

        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement1 = connection.prepareStatement(sql)) {

            ResultSet resultSet1 = preparedStatement1.executeQuery();

            while (resultSet1.next()) {
                if (Objects.isNull(person)) {
                    person = mapperService.getPersonEntityMapper().map(resultSet1);
                } else if (resultSet1.getInt("person_id") != person.getId()) {
                    person.setHobbies(new ArrayList<>());
                    person.getHobbies().addAll(hobbies);
                    persons.add(person);
                    hobbies.clear();
                    person = mapperService.getPersonEntityMapper().map(resultSet1);
                }
                if (resultSet1.getInt("person_id") == person.getId()) {
                    hobby = mapperService.getHobbyEntityMapper().map(resultSet1);
                    hobbies.add(hobby);
                }
            }
        } catch (SQLException sqlException) {
            throw new DAOException(sqlException.getMessage());
        }
        return persons;
    }
}
