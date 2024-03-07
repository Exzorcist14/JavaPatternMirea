package task4;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = new ExecutorService(2);

        executorService.execute(() -> {
            int x = 0;
            while (x < 14)
                System.out.println(x++);
        });

        executorService.execute(() -> {
            System.out.println("Start");
        });
    }
}