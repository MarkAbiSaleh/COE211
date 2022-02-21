package entrypoint;

import java.util.Scanner;

public class entrypoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fn,ln,age;
		int s;
		System.out.print("Please input the employee's first name: ");
		fn = scan.nextLine();
		System.out.print("Please input the employee's last name: ");
		ln = scan.nextLine();
		System.out.print("Please input the employee's age: ");
		age = scan.nextLine();
		System.out.print("Please input the employee's monthly salary: ");
		s = scan.nextInt();
		System.out.print("Employee information: "+ fn +" "+ ln + ", "+ age + ", "+ s);

	}

	
}
