

public class As155 {
    public static void main(String[] args) {
        fib(9);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int f1=0,f2=1,f3=0;
        for (int i = 1; i <= num-1; i++) {
            f1=f2+f3;
            f2=f3;
            f3=f1;
        }
        System.out.println(f1);

    }
}
