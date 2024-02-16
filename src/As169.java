

public class As169 {
    public static void main(String[] args){
        System.out.println(wordCount("one two three"));
    }

    public static int wordCount(String words) {
        return words.split(" ").length;

    }
}
