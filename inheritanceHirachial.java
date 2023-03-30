package Assignment1;

class Animl{  
	void eat(){
		System.out.println("Animals eat to servive");
	}  
}  

class Dog extends Animl{  
	void bark(){
		System.out.println("Dogs Bark");
	}  
}  

class Cat extends Animl{  
	void meow(){
		System.out.println("Cats meow");
	}  
}  

public class inheritanceHirachial{  
	public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}  

