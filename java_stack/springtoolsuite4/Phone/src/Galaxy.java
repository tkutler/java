
public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return "beeep bonngng";
    }
    @Override
    public String unlock() {
        return "unlocking phone";
    }
    @Override
    public void displayInfo() {
		System.out.println(this.versionNumber);
		System.out.println(this.carrier);
		System.out.println(this.batteryPercentage); 
		System.out.println(this.ringTone);
    }
}
