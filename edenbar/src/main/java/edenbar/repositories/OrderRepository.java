package edenbar.repositories;

import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edenbar.models.Orders;

public interface OrderRepository extends CrudRepository<Orders, Integer> {

	List<Orders> findByIdcustomer(@Param("idcustomer") Integer idcustomer);
	List<Orders> findByIdorder(@Param("idorder") Integer idorder);

}
