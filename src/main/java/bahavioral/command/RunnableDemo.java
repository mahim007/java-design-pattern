package bahavioral.command;

public class RunnableDemo {
    public static void main(String[] args) {
        Task task1 = new Task(4, 5);
        Task task2 = new Task(5, 10);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}

class Task implements Runnable {
    private final int num1;
    private final int num2;

    public Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println(num1 * num2);
    }
}