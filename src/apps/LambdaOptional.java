package apps;

import java.util.Optional;
import java.util.function.Consumer;

public class LambdaOptional {
    public static void main(String[] args) {

        sayHallo("Rizal");
        String name = null;
        sayHallo(name);

        sayHalloElse("budi");
        sayHalloElse(name);
    }
    //sayHallo orElse
    public static void sayHalloElse(String name){
        // orElse
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("GOOD PEOPLE");

        System.out.println("HALLO "+upperName);
    }

    public static void sayHallo(String name){

        Optional.ofNullable(name)
                .map(String::toUpperCase)
//                .ifPresent(value -> System.out.println("HALLO "+value));
                .ifPresentOrElse(
                        value -> System.out.println("HALLO "+value),
                        () -> System.out.println("HALLO")
                        );


//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(String::toUpperCase);
//        optionalNameUpper.ifPresent(value -> System.out.println(value));


//        String upperName = name.toUpperCase();
//        System.out.println("HALLO "+upperName);
    }

}
