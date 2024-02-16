

import java.util.ArrayList;

public class As_ArrayList_search {
    public static String search(ArrayList<String> r, String find)
    {
        int idx = find.indexOf(" ");
        if(idx==-1) idx = find.length();
        for(String s : r) if(s.contains(find.substring(0,idx))) return s;
        return "no \""+find+"\" in any element";


    }

    public static void main(String[] args)
    {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo1");
        System.out.print(find_tst);//foo bar


    }//end main
}
