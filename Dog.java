/* Edgar Ruiz
 * March 1, 2017
 */

public class Dog implements Animal{

	private int age;

	public Dog(){
		age = 1;
	}

	public Dog(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int newAge){
		age = newAge;
	}

	public void makeSound(){
		System.out.println("Bark");
	}

	public void eat(){
		System.out.println("Dog biscuit please?");
	}

	public String description(){
		return "I am a dog with 4 legs";
	}
}