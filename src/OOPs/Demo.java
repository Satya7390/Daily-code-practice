package OOPs;


import java.util.*;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID, Age, Name and City in Sequence: ");
		Employee em = new Employee();
		em.id = sc.nextInt();
		em.age = sc.nextInt();
		em.name = sc.next();
		em.city = sc.next();
		em.display();

		System.out.println("\nNow Enter Car Details : id, model, price, brand & number");
		Car car = new Car();
		car.id = sc.nextInt();
		car.model = sc.next();
		car.price = sc.next();
		car.brand = sc.next();
		car.number = sc.next();
		car.car_details();

	}

}

class Employee {

	int id, age;
	String name, city;

	public void display() {
		System.out.println("\n-----------Student Details---------\n");
		System.out.println("Id : " + id);
		System.out.println("Age : " + age);
		System.out.println("Name : " + name);
		System.out.print("City : " + city);
	}

}

class Car {
	int id;
	String model, price, brand, number;

	public void car_details() {
		System.out.println("\n-----------Car Details---------");
		System.out.println("Car Id : " + id);
		System.out.println("Car Model : " + model);
		System.out.println("Car Price : " + price);
		System.out.print("Car Brand  : " + brand);
		System.out.print("Car Number  : " + number);

	}
}
