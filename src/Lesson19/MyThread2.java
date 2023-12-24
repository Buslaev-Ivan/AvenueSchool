package Lesson19;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
       while (true) {
           for (int i = 1000; i < 1040; i++) {
               System.out.println(i);
               try {
                   Thread.currentThread().sleep(250);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       }
    }
}
