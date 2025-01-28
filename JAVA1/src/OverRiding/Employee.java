package JAVA1.src.OverRiding;


class Manager extends Employee{
	
	public int salary() {
		
		int bonus = 10000;
		
		return 50000+bonus;
		
	}
	
}

public class Employee {
	
	public int salary() {
		return 50000;
	}

	public static void main(String[] args) {
		
		Employee e = new Employee();
		Manager m = new Manager();
		
		System.out.println("employee's salary ="+e.salary());
		System.out.println("manager's salary ="+m.salary());


	}

}
