package Lesson19.concert;

public class Pevets2 extends Thread {
    @Override
    public void run() {
        while (true) {

            //мы засыпаем по этому монитору
            synchronized (Monitors.MIKROFON) {//критическая зона
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            for (int i = 0; i < 2; i++) {
                System.out.println("Fa-------- "+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            //мы будем того кто спит по этому монитору
            synchronized (Monitors.MIKROFON) {//критическая зона
                Monitors.MIKROFON.notify();
            }

        }
    }
}
