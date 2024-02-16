
import java.util.*;

public class As_Swap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2)
    {
        String temp = list.get(pos1);
        list.set(pos1,list.get(pos2));
        list.set(pos2,temp);
        return list;
    }

    public static void main(String[] args)
    {
        System.out.println(swap(new ArrayList<>(Arrays.asList("one","two","three")),0,2));
    }//end main
}
