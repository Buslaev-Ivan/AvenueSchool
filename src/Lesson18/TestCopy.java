package Lesson18;

public class TestCopy {
    public static void main(String[] args) {
        CopyWithOneByteUtils copyWithOneByteUtils = new CopyWithOneByteUtils();
        CopyWithNIOUtils copyWithNIOUtils = new CopyWithNIOUtils();
        CopyWithGuava copyWithGuava = new CopyWithGuava();
        CopyWithApacheCommons copyWithApacheCommons = new CopyWithApacheCommons();
        CopyByChannel copyByChannel = new CopyByChannel();

        long time1 = System.currentTimeMillis();
        try {
            copyWithOneByteUtils.copyFile("C:\\Users\\user\\Downloads\\videotest.mp4", "C:\\Users\\user\\Downloads\\test\\newvideo1.mp4");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        long time2 = System.currentTimeMillis();

        System.out.println("Copy with one byte:" + (time2 - time1));

        long time3 = System.currentTimeMillis();
        try {
            copyWithNIOUtils.copyFile("C:\\Users\\user\\Downloads\\videotest.mp4", "C:\\Users\\user\\Downloads\\test\\newvideo2.mp4");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        long time4 = System.currentTimeMillis();

        System.out.println("Copy with NIO:" + (time4 - time3));

        long time5 = System.currentTimeMillis();
        try {
            copyWithGuava.copyFile("C:\\Users\\user\\Downloads\\videotest.mp4", "C:\\Users\\user\\Downloads\\test\\newvideo3.mp4");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        long time6 = System.currentTimeMillis();
        System.out.println("Copy with Guava:" + (time6 - time5));

        long time7 = System.currentTimeMillis();
        try {
            copyWithApacheCommons.copyFile("C:\\Users\\user\\Downloads\\videotest.mp4", "C:\\Users\\user\\Downloads\\test\\newvideo4.mp4");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        long time8 = System.currentTimeMillis();
        System.out.println("Copy with ApacheCommons:" + (time8 - time7));

        long time9 = System.currentTimeMillis();
        try {
            copyByChannel.copyFile("C:\\Users\\user\\Downloads\\videotest.mp4", "C:\\Users\\user\\Downloads\\test\\newvideo5.mp4");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        long time10 = System.currentTimeMillis();
        System.out.println("Copy by Channel:" + (time10 - time9));
    }
}
