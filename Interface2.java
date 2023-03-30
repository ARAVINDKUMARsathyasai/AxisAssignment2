package Assignment1;

abstract class SIM{
	public abstract void datapack();
	public abstract void calling();
}

class jio extends SIM{
	@Override
	public void datapack() {
		System.out.println("Jio data packs can be activated through Myjio app or through UPI apps");
	}
	
	@Override
	public void calling() {
		System.out.println("Will provide smmoth caller experience");
	}
}

class Airtel extends SIM{
	@Override
	public void datapack() {
		System.out.println("Airtel data packs can be activated through Airtel thanks app or through UPI apps");
	}
	
	@Override
	public void calling() {
		System.out.println("Will provide best caller experience");
	}
}

public class Interface2 {
	public static void main(String ...args) {
		jio ji = new jio();
		ji.datapack();
		ji.calling();
		
		System.out.println("");
		Airtel at = new Airtel();
		at.datapack();
		at.calling();
	}
}
