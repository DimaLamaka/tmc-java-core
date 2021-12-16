package by.lamaka.lesson10.task2.service;

import java.io.*;

public class FileServiceImpl implements FileService {


    @Override
    public StringBuilder readFile(String path) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine() + "\n");
            }
        }
        return stringBuilder;
    }

    @Override
    public void writeFile(String text, String path) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write(text);
        }
    }

    @Override
    public String getTextByREGEX(String text, String mainRegex, String addRegex) {
        String result = "";
        String[] strings = text.split("\n");
        boolean isAdd = false;
        for (String str : strings) {
            if (str.contains(mainRegex)) {
                result += str + "\n";
                isAdd = true;
            } else if (isAdd && !str.contains(mainRegex) && !str.contains(addRegex)) {
                result += str + "\n";
                isAdd = true;
            } else {
                isAdd = false;
            }
        }
        return result;
    }
}
