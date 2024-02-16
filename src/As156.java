

public class As156 {
    public static void main(String[] args){

        System.out.println(countAppearance(new String[]{"a","foo","bar","foo","bla"}, "foo"));
    }

    public static int  countAppearance(String[] arr,String t){
        int count=0;
        for(String w : arr) if(w.equals(t)) count++;
        return count;
    }


}

