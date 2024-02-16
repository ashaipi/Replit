
import java.util.*;

public class As130 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int sizeInner = scan.nextInt();
            int sizeOuter = scan.nextInt();
            int[] inner = new int[sizeInner];
            int[] outer = new int[sizeOuter];
            for(int i =0; i < sizeInner; i++) inner[i] = scan.nextInt();
            for(int j =0; j < sizeOuter; j++) outer[j] = scan.nextInt();
            Arrays.sort(inner);
            Arrays.sort(outer);
            //WRITE YOUR CODE HERE

            boolean b=false;
            int count=0;
            for(int i =0; i < sizeInner; i++) {
                for(int j =0; j < sizeOuter; j++) if(inner[i]==outer[j]) b=true;
                if(b==true) count++;
                b=false;
            }

            if(count==sizeInner) System.out.println(true);
            else System.out.println(false);


        }



}
