package practice.java;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private int age;
	private double salary;
	private String dept;
	public Employee(String name, int age, double salary, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
}
public class MaxSalEmployeeJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = List.of(new Employee("Upasana",28,15000.0,"IT"),new Employee("Ravi",28,25000.0,"IT"),new Employee("sana",38,12000.0,"ITIS"),new Employee("Upa",18,10000.0,"Accounts"));
		Map<String, Optional<Employee>> maxSalEmp = employees.stream()
				.collect(Collectors.groupingBy(e -> e.getDept(),Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		maxSalEmp.forEach((dept,maxsal)->System.out.println(dept+":"+maxsal.get().getSalary()));
		System.out.println("sort employee by age and salary");
		List<Employee> sortedEmp = employees.stream().
				sorted(Comparator.comparingInt(Employee::getAge).thenComparingDouble(Employee::getSalary)).collect(Collectors.toList());
		sortedEmp.forEach(emp -> System.out.println(emp.toString()));
		System.out.println("Max age of employee");
		OptionalInt maxAgeEmp = employees.stream().mapToInt(Employee::getAge).max();
		System.out.println(maxAgeEmp.getAsInt());
		System.out.println("Print employees with age>24");
		List<Employee> empAge24 = employees.stream().filter(e -> e.getAge()>24).collect(Collectors.toList());
		empAge24.forEach(e-> System.out.println(e.getName()+":"+e.getAge()));
		System.out.println("Find employee with seq sana");
		List<Employee> empsana = employees.stream().filter(e->e.getName().contains("sana")).collect(Collectors.toList());
		empsana.forEach(e->System.out.println(e.getName()));
	}

}
