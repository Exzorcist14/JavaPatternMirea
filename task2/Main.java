package task2;

import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = List.of(
            new Human(19, "Vladimir", "Namestnikov", LocalDate.parse("14-08-2004", DateTimeFormatter.ofPattern("dd-MM-yyyy")), 90),
            new Human(22, "Dilyra", "Sultonova", LocalDate.parse("26-12-2001", DateTimeFormatter.ofPattern("dd-MM-yyyy")), 55),
            new Human(27, "Vladislav", "Namestnikov", LocalDate.parse("08-06-1996", DateTimeFormatter.ofPattern("dd-MM-yyyy")), 90),
            new Human(18, "Ivan", "Ivanov", LocalDate.parse("01-01-2005", DateTimeFormatter.ofPattern("dd-MM-yyyy")), 72)
        );

        System.out.println("All humans");
        humans.forEach(System.out::println);

        List<Human> sortedWeight = humans.stream().sorted(Comparator.comparingInt(h -> -h.weight)).collect(Collectors.toList());
        System.out.println("\nСписок людей, отсортированный по весу в обратном порядке:");
        sortedWeight.forEach(System.out::println);

        List<Human> neIvanov = humans.stream().filter(h -> h.lastName != "Ivanov").collect(Collectors.toList());
        System.out.println("\nСписок людей не с фамилией Иванов:");
        neIvanov.forEach(System.out::println);

        List<Human> sortedAge = humans.stream().sorted(Comparator.comparingInt(h -> h.age)).collect(Collectors.toList());
        System.out.println("\nСписок людей, отсортированный по возрасту:");
        sortedAge.forEach(System.out::println);

        int prodAges = humans.stream().mapToInt(h -> h.age).reduce(1, (a, b) -> (a * b));
        System.out.println("\nПроизведение всех возрастов: ");
        System.out.println(prodAges);
    }
}
