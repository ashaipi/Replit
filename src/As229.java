

public class As229 {
    public static void main(String[] args){
        System.out.println(badP(new int[]{1,1,1,1},5));
    }
    public static boolean badP(int[] products, int limit)
    {
        int count=0;
        for(int i =0 ; i< products.length ; i++) if(products[i]==0) count++;
        if(limit>count) return true;
        else return false;
    }
}
