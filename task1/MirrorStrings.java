package task1;

import java.util.Arrays;
import java.util.function.Function;

public class MirrorStrings {
    public static void main(String[] args) {
        Function<String[], String[]> mirrorFunction = strings ->
                Arrays.stream(strings)
                        .map(str -> new StringBuilder(str).reverse().toString())
                        .toArray(String[]::new);

        String[] inputArray = {"Mirea", "is", "fun"};
        String[] mirroredArray = mirrorFunction.apply(inputArray);

        System.out.println("Исходный массив: " + Arrays.toString(inputArray));
        System.out.println("Отзеркаленный массив: " + Arrays.toString(mirroredArray));
    }
}
