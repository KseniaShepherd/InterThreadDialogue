public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("threadGroup");
        Thread thread1 = new MyThread(threadGroup, "1");
        Thread thread2 = new MyThread(threadGroup, "2");
        Thread thread3 = new MyThread(threadGroup, "3");
        Thread thread4 = new MyThread(threadGroup, "4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        Thread.sleep(15000);
        threadGroup.interrupt();
        System.out.println("Завершаю все потоки.");
    }
}
