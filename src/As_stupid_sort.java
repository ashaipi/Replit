

import java.util.Arrays;

public class As_stupid_sort {
    public static void main(String[] args) {
        isSorted(new int[]{2,4,6,1,3,5,0});
        int[][] newI = stupidSort(new int[]{2,4,6,1,3,5,0});
        System.out.println("["+newI[0][0]+","+Arrays.toString(newI[1])+"]");
    }

    public static int[][] stupidSort(int[] i)
    {
        int[][] newArr = new int[2][i.length];
        int count=0;
        while(!isSorted(i))
        {
            shuffle(i);
            count++;
        }
        newArr[0][0]=count;
        for (int j = 0; j <i.length ; j++) newArr[1][j]=i[j];
        return newArr;
    }//end stupidSort

    public static int[] shuffle(int[] i)
    {
        for(int x = 0; x < i.length; ++x) {
            int index1 = (int) (Math.random() * i.length),
                    index2 = (int) (Math.random() * i.length);
            int a = i[index1];
            i[index1] = i[index2];
            i[index2] = a;
        }
        return i;
    }//end shuffle

    private static boolean isSorted(int[] i)
    {
        /* // to sort an array not sorted
        int count=0;
        System.out.println(Arrays.toString(i));
        for (int j = 0; j <i.length ; j++) {
            for (int k = 0; k <i.length-j ; k++) {
                if(i[j]>i[k+j]){
                    int t = i[j];
                    i[j] = i[k+j];
                    i[k+j] = t;
                    j--;
                    break;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(i));
        System.out.println(count);
        */
        for (int j = 0; j <i.length-1 ; j++) if(i[j]>i[j+1]) return false;
        return true;
    }//end isSorted

}
