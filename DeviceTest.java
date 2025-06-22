package practiceANDrevision;
abstract class Device{
	String brand;
	Device(String brand){
			this.brand=brand;
}
	public abstract void powerOn();
	public void showBrand() {
		System.out.println("the brand name is "+brand);
	}
}
interface Cameraa {
    void takePhoto();
}
interface MusicPlayerrr {
    void playMusic();
}
class SmartPhoone extends Device implements Cameraa,MusicPlayerrr{
	SmartPhoone(){
		super("iphone");
	}
	public void powerOn() {
		System.out.println("smartphone is charged and now is turning on");
	}
	public void takePhoto() {
		System.out.println("hey Siri! open camera and take a pic");
	}
	public void playMusic() {
		System.out.println("hey Siri! open Spotify and play music");
	}

}
public class DeviceTest {
	public static void main(String[] args) {
		Device d=new SmartPhoone();
		d.powerOn();
		d.showBrand();
		Cameraa c=new SmartPhoone();
		c.takePhoto();
		MusicPlayerrr m=new SmartPhoone();
		m.playMusic();
	}

}
