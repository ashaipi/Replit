
import java.sql.Array;
import java.util.*;
public class As192 {
    public static void main(String[] args)
    {
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(1,3,5,7,2));
        timesTwo(n);
    }
    //create your method below
    public static void timesTwo(ArrayList<Integer> nums){
        for(int i=0; i< nums.size() ; i++) nums.set(i, nums.get(i)*2);
        System.out.println(nums);
    }
}
