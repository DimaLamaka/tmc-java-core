package by.lamaka.lesson13.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hobby {
    private int id;
    private String name;
    private String type;

    public Hobby(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
