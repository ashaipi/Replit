

public class As165 {
    public static void main(String[] args){
            System.out.println(getThunderBlazz(false,true,3,1,2));
        }
        public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
                , int ingredient2, int ingredient3)
        {
            boolean ingredient=false;
                if((ingredient1==1 || ingredient1==3) &&
                        (ingredient2==2 || ingredient2==1) &&
                        (ingredient3==3 || ingredient3==1)) ingredient=true;
            return(available || gift || ingredient);

        }
    }
