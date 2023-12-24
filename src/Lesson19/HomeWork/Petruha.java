package Lesson19.HomeWork;

import static Lesson19.HomeWork.Monitors.*;

public class Petruha extends Thread {
    private boolean needStop = false;
    public void run() {
        int count = 2;
        while (!needStop) {
            //встаем в режим ожидания
            synchronized (VASYAPETRUHA) {//критическая зона
                try {
                    VASYAPETRUHA.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (count > 10) { //условие остановки потока
                needStop = true; //остановка потока
            }
            System.out.println(count + " - Я поток " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count += 2; //5 кругов. шаг 2. 2-4-6-8-10
            //передаем ожидающему права на действия
            synchronized (VASYAPETRUHA) {//критическая зона
                VASYAPETRUHA.notify();
            }
        }
    }
}
