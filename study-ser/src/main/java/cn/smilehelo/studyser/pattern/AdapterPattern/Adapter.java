package cn.smilehelo.studyser.pattern.AdapterPattern;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-29 00:23
 **/
public class Adapter implements Ps2{

    private Usb usb;

    public Usb getUsb() {
        return usb;
    }

    public void setUsb(Usb usb) {
        this.usb = usb;
    }

    public Adapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void connect() {
        usb.connect();
    }
}
