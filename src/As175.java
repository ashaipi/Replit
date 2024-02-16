

public class As175 {
    public static String lameDb(String db, String op, String id, String data) {
        String[] dB = db.split("#");
        String add="";
        int iD = Integer.parseInt(id)-1;
        switch(op){
            case "add"   : add="#"+id+data; break;
            case "edit"  : dB[iD]=id+data;  break;
            case "delete": dB[iD]="";       break;
        }
        String str = "";
        for(String d : dB) if(!d.isEmpty()) str+=d+"#";
        str=str.substring(0,str.length()-1);
        return str+add;
    }//end lameDb

    public static void main(String[] args) {
        System.out.print(lameDb("1etsy#2wooden#3spoon",  "add",    "4", "aaa") + "\n");
        System.out.print(lameDb("1tst#2bla#3foo",        "edit",   "2", "bbb") + "\n");
        System.out.print(lameDb("1tst#2bla#3foo",        "delete", "1", "") + "\n");
        System.out.print(lameDb("1tst#2bla#3foo",        "none",   "1", "") + "\n");
    }
}
