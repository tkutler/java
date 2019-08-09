
public class iPhone extends Phone implements Ringable {
	public iPhone (String versionNumber, int batteryPercentage,String carrier,String ringTone) {
		super(versionNumber, batteryPercentage,carrier,ringTone);
		
	}
	@Override 
	public String ring() {
		return "ring ring";
	}
	@Override 
	public String unlock() {
		return "phone is unlocked";
	}
	@Override 
	public void displayInfo() {
		System.out.println(this.versionNumber);
		System.out.println(this.carrier);
		System.out.println(this.batteryPercentage); 
		System.out.println(this.ringTone);

	}

}
