package by.lamaka.lesson10.task1.service;

public interface SerializationService<T> {
    void serialization(T t);

    T deserialization();
}
