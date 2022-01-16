package by.lamaka.lesson13.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    private int id;
    private String name;
    private boolean sex;
    private Date date;
    private List<Hobby> hobbies;

    public Person(String name, boolean sex,Date date, List<Hobby> hobbies) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.hobbies = hobbies;
    }
}
