package unrealComputer;

public class SalesAssociate extends Employee {

	public SalesAssociate(String name, int id, double salary) {
		super(name, id, salary);
		setTitle("Sales Associate");
	}

	@Override
	public void pay() {
		amountEarned += getSalary() * getTimeWorked();
		System.out.println(getTitle() + ": " + getName() + " has been paid " + (getSalary() * getTimeWorked()));
	}
	
	@Override
	public void logTime() {
		System.out.println("Input the hours worked by this employee");
		setTimeWorked(UCSPayrollSystem.sc.nextInt());
	}

}
