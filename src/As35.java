
import java.util.*;

public class As35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE
        int balance = 100, price;
        int i = 0;

        if (item.equals("Smartphone")) {
            if (300 <= balance) balance -= 300;
            else i = 2;
        } else if (item.equals("Laptop")) {
            if (400 <= balance) balance -= 400;
            else i = 2;
        } else if (item.equals("Charger")) {
            if (15 <= balance) balance -= 15;
            else i = 2;
        } else if (item.equals("USB cable")) {
            if (10 <= balance) balance -= 10;
            else i = 2;
        } else if (item.equals("Headphones")) {
            if (30 <= balance) balance -= 30;
            else i = 2;
        } else if (item.equals("Pants")) {
            if (50 <= balance) balance -= 50;
            else i = 2;
        } else if (item.equals("Hat")) {
            if (25 <= balance) balance -= 25;
            else i = 2;
        } else if (item.equals("Socks")) {
            if (5 <= balance) balance -= 5;
            else i = 2;
        } else if (item.equals("Blanket")) {
            if (60 <= balance) balance -= 60;
            else i = 2;
        } else if (item.equals("Pillow")) {
            if (40 <= balance) balance -= 40;
            else i = 2;
        } else {
            System.out.println("Invalid item!");
            i = 1;
        }

        if (i == 0) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (i == 2) System.out.println("Sorry, not enough funds on your gift card!");
    }
}
