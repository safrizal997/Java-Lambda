package apps;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        Predicate<String> checkStringIsBlank = value -> value.isBlank();

        System.out.println(checkStringIsBlank.test(""));

    }
}
