
public class HumanTest {
	public static void main(String[] args) {
		Human John = new Human ();
		Human Pete = new Human();
		John.attack(Pete);
		Wizard Gandalf = new Wizard ();
		Gandalf.fireball(Pete);
		Gandalf.fireball(John);
		Samurai Sam = new Samurai();
		Samurai Chris = new Samurai();
		Ninja Won = new Ninja();
		Ninja Mike = new Ninja();
		Sam.deathBlow(John);
		Sam.meditate();
		Sam.howMany();
		Won.steal(Pete);
	}

}
