package unrealComputer;

public abstract class Employee {
	
	 protected String title;
     protected String name;
     protected int id;
     protected int timeWorked;
     protected double salary;
     protected int amountEarned;
     
     public Employee(String name, int id, double salary) {
		this.title = "none";
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
    
    abstract public void  pay();
    
    abstract public void logTime();
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	private void setSalary(int salary) {
		this.salary = salary;
	}

	public int getTimeWorked() {
		return timeWorked;
	}

	public void setTimeWorked(int timeWorked) {
		this.timeWorked = timeWorked;
	}
	
	@Override
	public String toString() {
		return getTitle() + ": " + getName() + ", ID: " + getId() + ", Salary: " + getSalary() + ", Money Earnt: " + amountEarned;
	}
}
