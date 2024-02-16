

public class As167 {
    public static void main(String[] args) {
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String newStr="";
        while(!str.isEmpty()) {
            newStr+=str.charAt(0);
            str = str.replace(str.charAt(0)+"", "");
        }
        return newStr;
    }
}
