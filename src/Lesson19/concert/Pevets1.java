package Lesson19.concert;

public class Pevets1 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!needStop) {
            count++;
            if (count > 3) {
                needStop = true;
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("--------La " + Thread.currentThread().getName());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            //мы будем того кто спит по этому монитору
            synchronized (Monitors.MIKROFON) {//критическая зона
                Monitors.MIKROFON.notify();
            }

            //мы засыпаем по этому монитору
            synchronized (Monitors.MIKROFON) {//критическая зона
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
