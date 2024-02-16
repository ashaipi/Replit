import java.util.Arrays;

public class As195 {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","Silent"));
    }
    public static boolean isAnagram(String word1, String word2) {
        boolean b=false;
        char[] w1 = word1.toUpperCase().toCharArray();
        char[] w2 = word2.toUpperCase().toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        if((new String(w1)).equals(new String(w2))) return true;
        else return false;  
    }
}
