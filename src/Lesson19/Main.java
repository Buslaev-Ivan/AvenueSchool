package Lesson19;

public class Main {
    public static void main(String[] args) {
       MyThread myThread=new MyThread();
       myThread.start();

//       Thread myThread2 = new Thread(new MyThread2());
//       myThread2.start();

        for (int i=0; i<10;i++){
            System.out.println(i);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
