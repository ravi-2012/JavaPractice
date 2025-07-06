package practice.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order{
	String customer;
	double amount;
	public Order(String customer, double amount) {
		super();
		this.customer = customer;
		this.amount = amount;
	}
	
}
public class GroupOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> orders = List.of(new Order("Alice",100.0),new Order("Bob",150.0),new Order("Alice",200.0),new Order("Charlie",250.0),new Order("Bob",100.0));
		Map<String,Double> res = orders.stream().collect(Collectors.groupingBy(o->o.customer, Collectors.summingDouble(o->o.amount)));
		res.forEach((customer,total)->System.out.println(customer+":"+total));
	}

}
