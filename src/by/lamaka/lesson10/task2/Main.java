package by.lamaka.lesson10.task2;


import by.lamaka.lesson10.task2.service.FileService;
import by.lamaka.lesson10.task2.service.FileServiceImpl;

import java.io.IOException;

public class Main {
    private static final String PATH = "src/by/lamaka/lesson10/task2/resources/text.txt";
    private static final String PATH_HIS_TEXT = "src/by/lamaka/lesson10/task2/resources/hisText.txt";
    private static final String PATH_HER_TEXT = "src/by/lamaka/lesson10/task2/resources/herText.txt";

    public static void main(String[] args) {
        FileService fileService = new FileServiceImpl();
        StringBuilder stringBuilder = null;

        try {
            stringBuilder = fileService.readFile(PATH);
            String herText = fileService.getTextByREGEX(stringBuilder.toString(), "ОНА:", "ОН:");
            String hisText = fileService.getTextByREGEX(stringBuilder.toString(), "ОН:", "ОНА:");

            fileService.writeFile(herText, PATH_HER_TEXT);
            fileService.writeFile(hisText, PATH_HIS_TEXT);
        } catch (IOException e) {
            System.err.println(e);
        }


    }
}
