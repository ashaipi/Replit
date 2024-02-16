
import java.util.*;

public class As127 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] num = new int[size];
            for(int i =0; i < size; i++) {
                num[i] = scan.nextInt();
            }
            //WRITE YOUR CODE HERE
            //int[] newNum = {num[0],num[1]};


            if(size==1) { int[] newNum = {num[0]};         System.out.println(Arrays.toString(newNum));}
            else        { int[] newNum = {num[0], num[1]}; System.out.println(Arrays.toString(newNum));}



        }


}
