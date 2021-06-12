package apps;

import util.StringUtil;

import java.util.function.Predicate;

public class MethodReference {
    public static void main(String[] args) {
//        Predicate<String> checkIsLowerCase = new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return StringUtil.checkIsLowerCase(value);
//            }
//        };

        //Static Method
        Predicate<String> checkIsLowerCase = StringUtil::checkIsLowerCase;

        System.out.println(checkIsLowerCase.test("Makanan"));

        //Call method non static
        MethodReference methodReference = new MethodReference();
        methodReference.run();
        methodReference.run2();


    }
    //Non Static in this class

    public void run() {
//        Predicate<String> checkIsLowerCase2 = new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return MethodReference.this.checkIsLowerCaseNonStatic(value);
//            }
//        };

        Predicate<String> checkIsLowerCase2 = this::checkIsLowerCaseNonStatic;

        System.out.println(checkIsLowerCase2.test("rizal"));
    }

    public boolean checkIsLowerCaseNonStatic(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
    //Non Static in other class
    public void run2(){
//        StringUtil checkUpper = new StringUtil();
        Predicate<String> checkIsUpperCase = new StringUtil()::checkIsUpperCase;

        System.out.println(checkIsUpperCase.test("RIGHT"));
    }
}
