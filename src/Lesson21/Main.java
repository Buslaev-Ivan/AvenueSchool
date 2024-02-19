package Lesson21;

import Lesson18.CopyWithGuava;
import Lesson18.CopyWithNIOUtils;
import Lesson18.CopyWithOneByteUtils;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl("C:\\Users\\Professional\\Desktop\\testvideo\\video (1).mp4", "C:\\Users\\Professional\\Desktop\\newtestvideo\\newvideo (1).mp4");
        CopyFileTaskImpl task2 = new CopyFileTaskImpl("C:\\Users\\Professional\\Desktop\\testvideo\\video (2).mp4", "C:\\Users\\Professional\\Desktop\\newtestvideo\\newvideo (2).mp4");
        CopyFileTaskImpl task3 = new CopyFileTaskImpl("C:\\Users\\Professional\\Desktop\\testvideo\\video (3).mp4", "C:\\Users\\Professional\\Desktop\\newtestvideo\\newvideo (3).mp4");

        task1.setFileCopyUtils(new CopyWithGuava());
        task2.setFileCopyUtils(new CopyWithOneByteUtils());
        task3.setFileCopyUtils(new CopyWithNIOUtils());


        FindFilesTask task4 = new FindFileTaskImpl();
        task4.setDirectory("C:\\Users\\Public");
        task4.setFileNameSearchString("a");
        task4.setPrintStream(System.out);

        FindFilesTask task5 = new FindFileTaskImpl();
        task5.setDirectory("C:\\Users\\Publicasdgasdfgasgsdfsdaf");
        task5.setFileNameSearchString(".java");
        task5.setPrintStream(System.out);

        TasksStorage storage = new TaskStorageImpl();
        storage.add(task1);
        storage.add(task3);
        storage.add(task5);
        storage.add(task4);
        storage.add(task2);

        TaskExecutorImpl executor1 = new TaskExecutorImpl();
        TaskExecutorImpl executor2 = new TaskExecutorImpl();
        TaskExecutorImpl executor3 = new TaskExecutorImpl();

        executor1.setStorage(storage);
        executor2.setStorage(storage);
        executor3.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();
    }
}
