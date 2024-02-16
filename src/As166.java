

public class As166 {
    public static void main(String[] args) {
        System.out.println(mergeStrings("abcde","12345918273"));
    }

    public static String mergeStrings(String one, String two) {

        String str="";
        String c1="",c2="";
        int i=0;
        for ( i = 0; (i<one.length() || i<two.length()); i++, c1="", c2="") {
            if(i<one.length()) c1=""+one.charAt(i);
            if(i<two.length()) c2=""+two.charAt(i);
            str+=c1+c2;
        }
        return str;
    }
}
