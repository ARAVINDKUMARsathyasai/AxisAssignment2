package Assignment1;

abstract class ICars{
	public abstract void ridding();
	public abstract void millage();
	
	public void feaures () {
		System.out.println("Best engine");
		System.out.println("Should have regular services");
	}
}

class BMW extends ICars{

	@Override
	public void ridding() {
		System.out.println("These cars can support long ride with comfort");
	}
	@Override
	public void millage() {
		System.out.println("These dont have best millage comparitivly");
	}
	
}

class Suziki extends ICars{
	@Override
	public void ridding() {
		System.out.println("These cars can support long ride with some less comfort");
	}
	@Override
	public void millage() {
		System.out.println("These have best millage comparitivly");
	}
}

public class Cars {
	public static void main(String[] args) {
		BMW bw = new BMW();
		
		bw.ridding();
		bw.millage();
		bw.feaures();
		
		System.out.println("");
		Suziki sk = new Suziki();
		sk.ridding();
		sk.millage();
		sk.feaures();	
		
	}
}
