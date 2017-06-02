package edenbar.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import edenbar.models.Orders;
import edenbar.repositories.OrderRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/edenbar/orders")
public class OrdersController {
	@Autowired
	OrderRepository orderRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Orders> findOrders() {
		List<Orders> Orders = new ArrayList<>();
		Iterable<Orders> it = orderRepository.findAll();
		Iterator<Orders> iterator = it.iterator();
		while (iterator.hasNext()) {
			Orders.add(iterator.next());
		}
		return Orders;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{idcustomer}")
	public List<Orders> findByUser(@PathVariable Integer idcustomer) {
		System.out.println("public List<Orders> findByUser(@PathVariable Integer idcustomer) "+idcustomer);
		List<Orders> orders = new ArrayList<>();
		Iterable<Orders> it = orderRepository.findByIdcustomer(idcustomer);
		Iterator<Orders> iterator = it.iterator();
		while (iterator.hasNext()) {
			orders.add(iterator.next());
		}
		System.out.println("ordersByIdcustomer"+orders);
		return orders;
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	public Object create(@RequestBody Orders o) {
		orderRepository.save(o);
		return o;
	}
}
