package edenbar.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edenbar.models.Customer;
import edenbar.repositories.CustomerRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/edenbar/customer")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "/{usercode}")
    public List<Customer> findByidcustomer(@PathVariable Integer usercode) {
		List<Customer> Customers = new ArrayList<>();
		Iterable<Customer> it = customerRepository.findByidcustomer(usercode);
		Iterator<Customer> iterator = it.iterator();
		while (iterator.hasNext()) {
			Customers.add(iterator.next());
		}
		return Customers;
    }

}
