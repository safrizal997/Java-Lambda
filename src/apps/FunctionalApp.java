package apps;

import java.util.function.Function;

public class FunctionalApp {
    public static void main(String[] args) {

        Function<String, Integer> function = value -> value.length();

        System.out.println(function.apply("rizal"));
    }
}
