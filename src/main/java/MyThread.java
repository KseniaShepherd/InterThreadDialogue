public class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.println("Я поток " + this.getName() + ". Всем привет!");
                Thread.sleep(2500);
            }
        } catch (InterruptedException e) {
        }

    }
}