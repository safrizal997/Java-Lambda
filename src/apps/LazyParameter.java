package apps;

import java.util.function.Supplier;

public class LazyParameter {
    public static void main(String[] args) {
        testScore(80, LazyParameter::getName);
    }

    public static void testScore(int nilai, Supplier<String> name){
        if (nilai > 80){
            System.out.println("Selamat "+name.get()+", anda LULUS");
        }else{
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName (){
        System.out.println("getName() dipanggil");
        return "Rizal";
    }
}
