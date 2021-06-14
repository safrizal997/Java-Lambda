package apps;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaCollection {
    public static void main(String[] args) {

        LambdaCollection lambdaCollection = new LambdaCollection();
//       lambdaCollection.loopingList();

        // removeIf
        List<String> names = new ArrayList<>();
        names.addAll(List.of("eko","rizal","budi","nugroho"));

//        names.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String name) {
//                return name.length() > 5;
//            }
//        });

        names.removeIf(name -> name.length() > 5);

        System.out.println(names);

    }

    //ForEach
    List<String> list = List.of("rizal", "budi", "eko");

    public void loopingList(){

        for (var value : list){
            System.out.println(value);
        }

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

//        list.forEach(value ->System.out.println(value));
        list.forEach(System.out::println);

    }


}
