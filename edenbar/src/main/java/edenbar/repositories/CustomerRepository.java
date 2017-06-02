package edenbar.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edenbar.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	List<Customer> findByidcustomer(@Param("idcustomer") Integer idcustomer);
	
}
