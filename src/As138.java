
import java.util.*;

public class As138 {
    public static void main(String[] args) {

/*            [3, 6, 0, 4, 3, 2, 7, 0]

        Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
        Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
        Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
        Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
        Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
        Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
        ---- EXTINCT ----
         */
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};

        //TODO. Write you code below this line.
        int[] population = new int[inhabitants.length];
        for (int i = 0; i <population.length ; i++) population[i]=inhabitants[i];

        int count = -1;
        System.out.println("Day " + ++count + " " + Arrays.toString(inhabitants));
        while (true) {
            for (int i = 0; i < inhabitants.length; i++) {
                if (i == 0) {
                    if (inhabitants[i + 1] == 0)     population[i] = inhabitants[i] / 2;
                } else if (i == inhabitants.length-1) {
                    if (inhabitants[i - 1] == 0)     population[i] = inhabitants[i] / 2;
                } else {
                    if (inhabitants[i - 1] == 0)     population[i] = inhabitants[i] / 2;
                    else if(inhabitants[i + 1] == 0) population[i] = inhabitants[i] / 2;
                }
            }
            int allZero = 0;
            for (int j = 0; j < inhabitants.length; j++) {
                inhabitants[j]=population[j];
                if (inhabitants[j] == 0) ++allZero;
            }

            System.out.println("Day " + ++count + " " + Arrays.toString(inhabitants));
            if (allZero == inhabitants.length) break;
        }
        System.out.println("---- EXTINCT ----");


    }
}
