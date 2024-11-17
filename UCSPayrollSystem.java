package unrealComputer;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class UCSPayrollSystem {
	
	static Scanner sc = new Scanner(System.in);
	static PrintStream out = System.out;

	//TODO: Use employee IDs to implement binary search
	static ArrayList<Employee> employees = new ArrayList<>();
	static int currentID = 3;

	static {
		employees.add(new Manager("Diego Martin", 0, 55000));
		employees.add(new SalesAssociate("Kylie Walter", 1, 18.5));
		employees.add(new SalesAssociate("Micheal Rose", 2, 16.75));
	}
	
	public static void main(String[] args) {
		outer : while (true) {
			out.println("Welcome to the payroll system\n"
					+ "Press 1 to add an employee\n"
					+ "2 to log time worked of an employee\n"
					+ "3 to pay an employee\n"
					+ "4 to pay all employees\n"
					+ "5 to show a specific employee\n"
					+ "6 to show all employees\n"
					+ "7 to quit\n");

			if(sc.hasNextInt()) {
				int input = sc.nextInt();
				try {
					switch (input) {

						case 1 -> {
							out.println("Input the title, name and salary of the employee, separated with commas, and using underscores instead of spaces");
							String[] employeeInfo = sc.next().replace("_", " ").split(",");
							Employee newHire = null;

							switch (employeeInfo[0].toLowerCase()) {
								case "sales associate" -> newHire = new SalesAssociate(employeeInfo[1], currentID++, Double.parseDouble(employeeInfo[2]));
								case "manager" -> newHire = new Manager(employeeInfo[1], currentID++, Double.parseDouble(employeeInfo[2]));
								default -> out.println("Invalid Title!");
							}
							if (newHire != null) {
								employees.add(newHire);
								out.println("Employee Added!");
							}
						}
						case 2 -> {
							out.println("Input the employee ID to log time to");
							int id = sc.nextInt();
							Employee searched = null;
							for (Employee employee : employees) {
								if (employee.getId() == id) {
									out.println("Employee found!");
									searched = employee;
									break;
								}
							}
							if (searched != null) {
								searched.logTime();
							} else {
								out.println("Employee not found!");
							}
						}
						case 3 -> {
							out.println("Input the employee ID to pay");
							int id = sc.nextInt();
							Employee searched = null;
							for (Employee employee : employees) {
								if (employee.getId() == id) {
									out.println("Employee found!");
									searched = employee;
									break;
								}
							}
							if (searched != null) {
								searched.pay();
							} else {
								out.println("Employee not found!");
							}
						}
						case 4 -> {
							for (Employee employee : employees) {
								employee.pay();
							}
						}
						case 5 -> {
							out.println("Input the employee ID to find");
							int id = sc.nextInt();
							Employee searched = null;
							for (Employee employee : employees) {
								if (employee.getId() == id) {
									out.println("Employee found!");
									searched = employee;
									break;
								}
							}
							if (searched != null) {
								out.println(searched);
							} else {
								out.println("Employee not found!");
							}
						}
						case 6 -> {
							for (Employee employee : employees) {
								out.println(employee);
							}
						}
						default -> {
							break outer;
						}
					}
				} catch (NullPointerException e) {
					out.println("Invalid Input!");
				}
			} else {
				/*oh my god why are scanners so awful to work with
				 if i have more time i ought to just make a class for the express purpose of not dealing with it's stupid quirks
				*/
				out.println("Invalid Input!");
				break;
			}

		}
	}

}
