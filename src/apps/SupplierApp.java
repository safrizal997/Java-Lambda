package apps;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> 25 - 10;

        System.out.println(supplier.get());
    }
}
