package by.lamaka.lesson10.task1.service;

import java.io.*;

public class SerializationServiceImpl<T> implements SerializationService<T> {
    private static final String PATH = "src/by/lamaka/lesson10/task1/resources/Data.dat";

    @Override
    public void serialization(T t) {
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(PATH))) {
            ous.writeObject(t);
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    @Override
    public T deserialization() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))) {
            Object o = ois.readObject();
            T t = (T) o;
            return t;
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
        return null;
    }
}
