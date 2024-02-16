

import java.util.ArrayList;
import java.util.Arrays;

public class As231 {
    public static void main(String[] args) {
        String s = reverseVowels("bioappleuy");
    }

    // a e i o u y
    public static String reverseVowels(String str) {
        String newStr="";
        ArrayList<Integer> idx = new ArrayList<>();
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='y') idx.add(i);
            if(str.charAt(i)=='A' || str.charAt(i)=='E' ||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='Y') idx.add(i);
        }

        char[] strArray = str.toCharArray();

        char temp;
        for (int i = 0; i < idx.size()/2 ; i++) {
            temp = strArray[idx.get(i)];
            strArray[idx.get(i)] = strArray[idx.get(idx.size()-i-1)];
            strArray[idx.get(idx.size()-i-1)] = temp;
        }
        for (int i = 0; i < strArray.length ; i++) newStr+=strArray[i];
        return newStr;
    }
}
