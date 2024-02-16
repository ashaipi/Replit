
import java.util.*;

public class As129 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float[] score = new float[7];
            //WRITE YOUR CODE HERE

            for(int i=0 ; i< score.length ; score[i]=input.nextFloat(), i++)
                System.out.println("Enter score for judge "+(i+1)+":");

            Arrays.sort(score);

            double total=0. , difficulty = 0.6;
            for(int i=1 ; i< score.length-1 ; i++) total+=score[i];

            System.out.println("Enter difficulty:");
            total*=(input.nextFloat()*difficulty);

            // FINAL OUTPUT
            System.out.printf("Total: %.2f", total);
        }

}
