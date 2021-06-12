package util;

public class StringUtil {
    public static boolean checkIsLowerCase(String value){
        for (var c : value.toCharArray()){
            if (!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }

    public boolean checkIsUpperCase(String value){
        for (var c : value.toCharArray()){
            if(!Character.isUpperCase(c)){
                return false;
            }
        }
        return true;
    }
}
