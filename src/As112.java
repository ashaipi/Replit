
import java.util.Arrays;

public class As112 {
    public static void main(String[] args) {
        String str = "Java is fun";
        String[] newStr = str.split(" ");
        System.out.println(Arrays.toString(newStr));
        for (int i = newStr.length-1; i >= 0  ; i--) {
            System.out.print(newStr[i]);
            if(i!=0) System.out.print(" ");
        }
    }
}
