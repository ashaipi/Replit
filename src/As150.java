package a_Repl_it;
import java.util.*;

public class As150 {
     public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            timeConversion("07:05:45PM");
        }

        public static void timeConversion(String s) {
            /*
             * Write your code here.
             */
            //int h= Integer.parseInt(s.split(":")[0]);
            int h = Integer.parseInt(s.split(":")[0])+12;
            String ms = ":"+s.split(":")[1]+":"+s.split(":")[2].substring(0,2);
            if(s.substring(s.length()-2).equalsIgnoreCase("PM"))
               System.out.println(h+ms);
            else System.out.println(s.substring(0,s.length()-2));
        }
}
