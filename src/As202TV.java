package a_Repl_it;

public class As202TV {
    int channel=1;
    int volumeLevel=1;
    boolean on = false;
    String brand = "undefined";

    public As202TV(){
        System.out.println("Creating TV object using no Args-constructor");
    }

    public As202TV(String brand){
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel(){
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel){
        if(isOn() && volumeLevel>=1 && volumeLevel<=7)
            this.volumeLevel=volumeLevel;
        else System.out.println("ERROR: TV is either OFF or invalid Volume level");
    }

    public int getChannel(){
        return channel;
    }
    public void setChannel(int channel){
        if(isOn() && channel>=1 && channel <=120) this.channel=channel;
        else System.out.println("ERROR: TV is either OFF or invalid Channel");
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    public void channelUp(){
        if(isOn() && channel <120) channel++;
        else System.out.println("ERROR: TV is either OFF or invalid Channel");
    }

    public void channelDown(){
        if(isOn() && channel>1) channel--;
        else System.out.println("ERROR: TV is either OFF or invalid Channel");
    }

    public void volumeUp(){
        if(isOn() && volumeLevel<7)
            volumeLevel++;
        else System.out.println("ERROR: TV is either OFF or invalid Volume level");

    }

    public void volumeDown(){
        if(isOn() && volumeLevel>1)
            volumeLevel--;
        else System.out.println("ERROR: TV is either OFF or invalid Volume level");
    }

    public boolean isOn(){
        return on;
    }

    public void turnOn(){
        if(on==true) System.out.println("TV is already ON");
        else on=true;
    }

    public void turnOff(){
        if(on==false) System.out.println("TV is already OFF");
        else on=false;
    }

}
