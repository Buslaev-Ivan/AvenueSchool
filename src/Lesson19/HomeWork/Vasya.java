package Lesson19.HomeWork;

import static Lesson19.HomeWork.Monitors.*;

public class Vasya extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 1;
        while (!needStop) {
            if (count ==9 ) { //условие остановки потока
                needStop = true; //остановка потока
            }
            System.out.println(count + " - Я поток " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count += 2; //5 кругов. шаг 2. 1-3-5-7-9

            //передаем ожидающему права на действия
            synchronized (VASYAPETRUHA) {//критическая зона
                VASYAPETRUHA.notify();
            }

            //встаем в режим ожидания
            synchronized (VASYAPETRUHA) {//критическая зона
                try {
                    VASYAPETRUHA.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
