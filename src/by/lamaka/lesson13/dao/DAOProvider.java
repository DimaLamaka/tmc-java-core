package by.lamaka.lesson13.dao;

import by.lamaka.lesson13.dao.impl.HobbyDAO;
import by.lamaka.lesson13.dao.impl.PersonDAO;
import by.lamaka.lesson13.dao.impl.PersonInfoDAO;
import by.lamaka.lesson13.entity.Hobby;
import by.lamaka.lesson13.entity.Person;
import lombok.Getter;

@Getter
public class DAOProvider {
    private static final DAOProvider DAO_PROVIDER = new DAOProvider();
    private final EntityDAO<Person> personEntityDAO = new PersonDAO();
    private final EntityDAO<Hobby> hobbyEntityDAO = new HobbyDAO();
    private final PersonInfoDAO personInfoDAO = new PersonInfoDAO();

    private DAOProvider() {
    }

    public static DAOProvider getInstance() {
        return DAO_PROVIDER;
    }
}
