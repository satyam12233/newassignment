package demo.hibernate;

public class Employee {
	
	
	private String empname;
	private String location;
	private int salary;

	public Employee(String empname, String location, int salary) {
		super();
		this.empname = empname;
		this.location = location;
		this.salary = salary;
	}
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getempname() {
		return empname;
	}

	public void setempname(String empname) {
		this.empname = empname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	
	}
	




