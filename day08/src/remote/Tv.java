package remote;

public class Tv implements Remote{

	@Override
	public void turnOn() {
		System.out.println("Turn on..");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off..");
		
	}
	
}
