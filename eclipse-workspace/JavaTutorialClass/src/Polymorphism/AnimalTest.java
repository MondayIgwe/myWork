package Polymorphism;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal[] pets = new Animal[3];
		
		pets[0] = new Cat();
		pets[1] = new Dog();
		pets[2] = new Animal();
		
		for (int i = 0; i<pets.length; i++) {
			System.out.println("Pet["+ i +"]:" + pets[i].talk());
		}
		

	}

}
