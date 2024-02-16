
import java.util.*;

public class As125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        System.out.println("Enter this [3, 6, 0, 4, 3, 2, 7, 1] only numbers");
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        // TODO. Write you code below this line.

        int count = -1;
        System.out.println("Day " + ++count + " " + Arrays.toString(inhabitants));
        while (true) {
            int allZero = 0;
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] /= 2;
                if (inhabitants[i] == 0) ++allZero;
            }
            System.out.println("Day " + ++count + " " + Arrays.toString(inhabitants));
            if (allZero == inhabitants.length) break;
        }
        System.out.println("---- EXTINCT ----");
    }

}
