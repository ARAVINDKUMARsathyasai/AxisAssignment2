package Assignment1;

class Animals{  
	void eat(){
		System.out.println("Animals eat to servive");
	}  
}  

class Dog extends Animals{  
	void bark(){
		System.out.println("Dogs bark");
	}  
}

class BabyDog extends Dog{  
	void weep(){
		System.out.println("Baby dogs weep ");
	}  
}  

public class inheritanceMultilevel{
	public static void main(String args[]){  
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
	}
}  
