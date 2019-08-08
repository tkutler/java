
public class Ninja extends Human {
	private Integer stealth = 10;
	public void steal(Human human) {
		human.health -= this.stealth;
		this.health += this.stealth;
		System.out.println("ninja stole from "+ human);
	}
	public void runAway() {
		this.health -= 10;
	}
	

}
