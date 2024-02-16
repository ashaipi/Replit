
public class AS202Main {
    public static void main(String[] args) {
        a_Repl_it.As202TV tv = new a_Repl_it.As202TV();
        tv.setBrand("sony");
        System.out.println("Is TV ON or OFF: "+tv.isOn());
        tv.turnOn();
        System.out.println("Know TV is: "+tv.isOn());

        tv.setVolumeLevel(6);
        System.out.println(tv.getVolumeLevel());

        tv.volumeUp();
        System.out.println(tv.getVolumeLevel());

        tv.volumeUp();
        System.out.println(tv.getVolumeLevel());

        tv.volumeDown();
        System.out.println(tv.getVolumeLevel());
        tv.volumeDown();
        System.out.println(tv.getVolumeLevel());
        tv.volumeDown();
        System.out.println(tv.getVolumeLevel());
        tv.volumeDown();
        System.out.println(tv.getVolumeLevel());

        System.out.println("tv.getBrand() = " + tv.getBrand());
        System.out.println("tv.getChannel() = " + tv.getChannel());
        System.out.println("tv.getVolumeLevel() = " + tv.getVolumeLevel());

        tv.channelDown();
        System.out.println("tv.getChannel() = " + tv.getChannel());


    }
}
