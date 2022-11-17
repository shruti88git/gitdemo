package day2;

public class MethodPractice1 {
	// access modifier non-access modifier return_type method_name(parameters)
	// {
	// }

	static public void addtionOfNumber() {
		int a = 15, b = 30;
		System.out.println("Addition of numbers :" + (a + b));
		return; // it is not necessary to write return statement here
		// if programmer don't write the return statement then jvm will write it implicitly at the time of compilation
	}

	public void subtractionOfNumber() {
		double d = 55.32, e = 12.15;
		System.out.println("Subtraction of numbers :" + (d - e));
	}

	static public void main(String[] args) {

		MethodPractice1.addtionOfNumber();
		
		//create object
		MethodPractice1 obj = new MethodPractice1();
		obj.subtractionOfNumber();
	}
}

// we can interchange the position of access-modifier and non-access modifier
// if we don't want to non-access modifier we should keep it blank