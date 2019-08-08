
public class Samurai extends Human {
	private static int count = 0;
	public Samurai() {
		this.health = 200;
		count++;
	}
	
	public void deathBlow(Human human) {
		human.health -= human.health; 
		this.health += human.health/2;
		System.out.println("wow the samurai killed "+ human);
	}
	public void meditate() {
		this.health += this.health/2;
		System.out.println("the samurai meditated");
	}
	public void howMany() {
		System.out.println(count); 
	}

}
