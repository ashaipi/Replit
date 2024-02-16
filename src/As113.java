
import java.util.*;

public class As113 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] nums = {1,5,9,5,1};
            //{input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
            boolean t = true;
            //TODO Type your code below:
            for(int i=0; i<nums.length-1;i++) {
                if (nums[i] == nums[i + 1] && nums[i] == 5) {
                    t = true;
                    break;
                } else t = false;
            }
                System.out.println(t);

        }
}
