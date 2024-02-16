

public class As232 {
    public static void main(String[] args) {
        System.out.println(countLetters("aaabbcccc"));
    }
    public static String countLetters(String str){
        String letter = "";
        while(!str.isEmpty()) {
            int letters = 0;
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(0) == str.charAt(i)) letters++;
            letter+=letters+""+str.charAt(0);
            str = str.replace("" + str.charAt(0), "");
        }
        return letter;
    }
}
