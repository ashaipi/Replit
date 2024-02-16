

public class As186 {
    public static void main(String[] args){
        System.out.println(extractNum("aa2aa3"));
    }
    public static String extractNum(String s) {
        return s.replaceAll("[^0-9]","");

    }
}
