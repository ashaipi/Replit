

import java.util.ArrayList;
import java.util.Arrays;

public class As_CombineAll {
    public static void main(String[] args) {
        ArrayList<String> wordL1 = new ArrayList<>(Arrays.asList("hi","this","world"));
        ArrayList<String> wordL2 = new ArrayList<>(Arrays.asList("hello","new","year"));
        System.out.println(combineAL(wordL1,wordL2));

    }

    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
        ArrayList<String> newWordList = new ArrayList<>();
        newWordList.addAll(wordList1);
        newWordList.addAll(wordList2);
        return newWordList;
    }
}
