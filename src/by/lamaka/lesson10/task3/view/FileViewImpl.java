package by.lamaka.lesson10.task3.view;

import java.io.File;

public class FileViewImpl implements FileView {

    @Override
    public String getFileView(File file) {
        StringBuilder result = new StringBuilder();
        if (file.isDirectory()) {
            result.append(file.getName() + "(DIR) FILES: \n");
            for (File f : file.listFiles()) {
                result.append("\t" + getFileView(f));
            }
        } else {
            result.append("\t" + file.getName() + "(File)\n");
        }
        return result.toString();
    }
}
