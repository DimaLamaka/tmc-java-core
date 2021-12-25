package by.lamaka.lesson13;

import by.lamaka.lesson13.dao.DAOProvider;
import by.lamaka.lesson13.entity.Hobby;
import by.lamaka.lesson13.entity.Person;
import by.lamaka.lesson13.exception.DAOException;


import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DAOProvider daoProvider = DAOProvider.getInstance();
        try {
            List<Person> personList = daoProvider.getPersonEntityDAO().getAll();
            personList.stream().forEach(System.out::println);
            System.out.println("----------------------------------------------------------");

            List<Hobby> hobbyList = daoProvider.getHobbyEntityDAO().getAll();
            hobbyList.stream().forEach(System.out::println);
            System.out.println("----------------------------------------------------------");

            /*daoProvider.getPersonEntityDAO().save(new Person("Evgeniy",true, new Date(System.currentTimeMillis()),
                    Arrays.asList(hobbyList.get(0))));*/

            /*daoProvider.getPersonEntityDAO().delete(17);*/
            /*daoProvider.getPersonEntityDAO().update(new Person(11,"Zhenya", true, Date.valueOf("1995-07-05"), hobbyList.subList(1,3)));*/

        } catch (DAOException e) {
            e.printStackTrace();
        }
    }
}
