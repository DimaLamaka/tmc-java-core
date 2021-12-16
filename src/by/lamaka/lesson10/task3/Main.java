package by.lamaka.lesson10.task3;

import by.lamaka.lesson10.task3.view.FileView;
import by.lamaka.lesson10.task3.view.FileViewImpl;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:/MyProjects/tmc/java-core");
        FileView fileView = new FileViewImpl();
        System.out.println(fileView.getFileView(file));
    }
}
