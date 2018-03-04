package AccessModifierDemo;

public class TestModifier {

	public static void main(String[] args) {
	//crete an object of the car class here
		car ford = new car();
		
		//Assign or set there values
		ford.name = "Fiesta"; //objectReference.VariableName
		ford.age = 35;
		ford.speed = 100;
		car.iWeek = 7; //ClassName.StaticVariable
		car.iMonth = 31;

		ford.DisplayCaharacter(); //objectReference.MethodName
		car.DispalyStaticCharacter(); //ClassName.StaicMethod
	}

}
