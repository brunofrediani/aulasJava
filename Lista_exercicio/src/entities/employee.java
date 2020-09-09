package entities;

public class employee {

	private int id;
	private String name;
	private double salary;

	public employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {

		salary += salary * percentage/ 100;

	}
	
	public String toString() {
		return "ID: "
				+ id
				+ ", nome: "
				+ name
				+ ", salario : $ "
				+ String.format("%.2f", salary);
	}
	
	
	

}
