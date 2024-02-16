

public class As179 {
    public static void main(String[] args){
        System.out.println(reverse("foo"));
    }
    public static String reverse(String input)
    {
        String str = "";
        for(int i=0 ; i<input.length() ; i++) str+=""+input.charAt(input.length()-1-i);
        return str;
    }
}
