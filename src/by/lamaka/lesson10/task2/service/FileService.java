package by.lamaka.lesson10.task2.service;

import java.io.IOException;

public interface FileService {
    StringBuilder readFile(String path) throws IOException;

    void writeFile(String text, String path) throws IOException;

    String getTextByREGEX(String text, String mainRegex,String addRegex);
}
