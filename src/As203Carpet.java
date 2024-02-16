

public class As203Carpet {

    //do not change -- Start
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below
    public As203Carpet(){
        this.width = 300;
        this.length = 300;
        this.unitPrice = 1/3;
        this.isPersian=true;
        System.out.println("Construction No-args");
    }
    public As203Carpet(double width,double  length,double unitPrice,boolean isPersian){
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;
    }

    public double totalPrice(){
        System.out.println("in class: "+width);
        if(isPersian) return ((width+length)*unitPrice)+200;
        else return ((width+length)*unitPrice);
    }
}
