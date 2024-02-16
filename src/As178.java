

import java.util.Arrays;

public class As178 {
    public static int[] mergR(int[] a,int[] b) {
        int[] merg = new int[(a.length)+(b.length)];
        for(int i=0 ; i<merg.length ; i++)
            if (i < a.length) merg[i] = a[i];
            else merg[i] = b[i-a.length];
        return merg;

    }//end mergR

    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(mergR(new int[]{1,2,3}, new int[]{4,5,6})));
    }
}
