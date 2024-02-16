

public class As176 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
            As176 m = new As176();
            System.out.println(m.findMax(new int[]{2,4,6,8,1}));
            System.out.println(m.findMax(new double[]{2.5,4.5,6.0,8.9,1.2}));
        }

        public int findMax(int[] num){
            int max=0;
            for(int n : num) if(max<n) max=n;
            return max;
        }
        public double findMax(double[] num){
            double max=0.0;
            for(double n : num) if(max<n) max=n;
            return max;
        }

}
