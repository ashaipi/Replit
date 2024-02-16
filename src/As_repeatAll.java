
import java.util.*;

public class As_repeatAll {
    public static void main(String[] args)
    {
        repeatAl(new ArrayList<>(Arrays.asList(true,false,false)));
    }
    //create your method below
    public static void repeatAl(ArrayList<Boolean> booleans){
        int size = booleans.size();
        for (int i = 0; i < size; i++) booleans.add(booleans.get(i));
        System.out.println(booleans);
    }
}
