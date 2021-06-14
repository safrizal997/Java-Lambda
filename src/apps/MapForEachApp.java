package apps;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1A","Budi");
        names.put("1B","Rizal");
        names.put("1C","Eko");

        //looping manual
        for(var name : names.entrySet()){
            System.out.println(name.getKey()+" : "+name.getValue());
        }
        System.out.println("\n");

        //looping anonymous class
        names.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+" : "+value);
            }
        });
        System.out.println("\n");

        //looping Lambda
        names.forEach((key, value) -> System.out.println(key+" : "+value));
    }
}
