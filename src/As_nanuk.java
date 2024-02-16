
import java.util.*;

public class As_nanuk {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("nanuk");
        arr.add("nanuk");
        
        boolean hunt = nanuk(arr, 2, 10);
        if (hunt) System.out.print("successful hunt");
        else      System.out.print("this hunt is doomed");
    }

    public static boolean nanuk(ArrayList<String> r,int way_stones,int boast)
    {
        int count=0, sum=0;
        for (int i = 0; i <r.size() ; i++) {
            if(r.get(i).equals("nanuk")) count++;
            else sum+=Integer.parseInt(r.get(i));
        }
        if(sum>boast && count<=way_stones) return true;

        return false;
    }
}
