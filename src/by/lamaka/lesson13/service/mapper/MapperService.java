package by.lamaka.lesson13.service.mapper;

import by.lamaka.lesson13.entity.Hobby;
import by.lamaka.lesson13.entity.Person;
import by.lamaka.lesson13.service.mapper.impl.HobbyMapper;
import by.lamaka.lesson13.service.mapper.impl.PersonMapper;
import lombok.Getter;

@Getter
public class MapperService {
    private static final MapperService MAPPER_SERVICE = new MapperService();
    private final EntityMapper<Hobby> hobbyEntityMapper = new HobbyMapper();
    private final EntityMapper<Person> personEntityMapper = new PersonMapper();

    private MapperService() {
    }

    public static MapperService getInstance() {
        return MAPPER_SERVICE;
    }
}
