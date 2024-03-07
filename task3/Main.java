package task3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        testSafeSet();
        testThreadSafeMap();
    }

    private static void testSafeSet() {
        SafeSet<Integer> set = new SafeSet<>();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 5; i++) {
            final int value = i;

            executor.execute(() -> {
                set.add(value);
                System.out.println("Добавление в множество: " + value + ", Размер: " + set.size());
            });
        }

        executor.shutdown();

        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ensure all elements are added
        System.out.println("Конечный размер множества: " + set.size());
        assert set.size() == 6 : "Размер множества некорректный!";
    }

    private static void testThreadSafeMap() {
        SafeMap<String, Integer> map = new SafeMap<>();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 5; i++) {
            final int value = i;

            executor.execute(() -> {
                map.put("Ключ" + value, value);
                System.out.println("Добавление в словарь: Ключ: " + value + ", Значение: " + value +
                        ", размер: " + map.size());
            });
        }

        executor.shutdown();

        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Конечный размер словаря: " + map.size());
        assert map.size() == 6 : "Размер словаря некорректный!";
    }
}
