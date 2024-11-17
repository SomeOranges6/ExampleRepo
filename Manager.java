package unrealComputer;

public class Manager extends Employee {

	public Manager(String name, int id, double salary) {
		super(name, id, salary);
		setTitle("Manager");
	}

	@Override
	public void pay() {
		amountEarned += getSalary()/52 * getTimeWorked() - (getSalary()/52 * getTimeWorked() * 0.13);
		System.out.println(getTitle() + ": " + getName() + " has been paid " + (getSalary()/52 * getTimeWorked() - - (getSalary()/52 * getTimeWorked() * 0.13)));
	}

	@Override
	public void logTime() {
		System.out.println("Input the weeks worked by this employee");
		setTimeWorked(UCSPayrollSystem.sc.nextInt());
	}

}
