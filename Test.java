/* Edgar Ruiz
 * March 1, 2017
 */

public class Test{
	public static void main(String[] args){
			Dog doug = new Dog();
			Dog oldie = new Dog(10);
			doug.makeSound();
			doug.eat();
			System.out.println(doug.description());
			System.out.println("Age: " + doug.getAge());
			doug.setAge(25);
			System.out.println("Age: " + oldie.getAge());
			System.out.println("New Age: " + doug.getAge());
	}
}