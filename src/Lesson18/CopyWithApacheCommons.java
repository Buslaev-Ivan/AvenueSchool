package Lesson18;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyWithApacheCommons implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File descFile = new File(destination);
        if (descFile.exists()) {
            throw new FileAlreadyExistsException("Файл назначения уже существует CopyWithApacheCommons");
        }

        File srcFile = new File(source);
        File destFile = new File(destination);

        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage());
        }

    }
}
