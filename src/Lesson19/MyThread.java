package Lesson19;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=100; i<120;i++){
            System.out.println(i);
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
