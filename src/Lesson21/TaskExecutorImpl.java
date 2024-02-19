package Lesson21;

public class TaskExecutorImpl extends Thread implements TaskExecutor {
    private TasksStorage storage;
    private boolean stopFlag = true;

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    public void run() {
        while (stopFlag) {
            // или взяли задачу или пришел null
            Task task = storage.get();
            if (task != null) { // если задача есть
                System.out.println("Я поток " + Thread.currentThread().getName() + " взял задачу: " + task);
                System.out.println("Я поток " + Thread.currentThread().getName() + " попытаюсь выполнить задачу: " + task);
                try {
                    task.execute();
                    System.out.println("Я поток " + Thread.currentThread().getName() + " выполнил успешно задачу: " + task);
                } catch (TaskExecutionFailedException e) {
                    System.out.println("Я поток " + Thread.currentThread().getName() + " не удалось выполнить задачу: " + task);
                    if (task.getTryCount() < 5) {// если ее пытались выполнить менее 5 раз
                        task.incTryCount();// увеличиваем сччетчик попыток на +1
                        storage.add(task);// возвращаем обратно задачу в хранилище
                    } else {// если попыток больше 5 раз - удаляем задачу
                        System.out.println("Я поток " + Thread.currentThread().getName() + " УДАЛЯЮ задачу: " + task);
                    }
                }
            } else {
                System.out.println("Я поток " + Thread.currentThread().getName() + " завершаю работу, задач нет " + task);
                stopFlag = false;
            }

        }
    }
}
