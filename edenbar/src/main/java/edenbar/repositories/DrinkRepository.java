package edenbar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edenbar.models.Drinks;


public interface DrinkRepository extends CrudRepository<Drinks, Integer> {

	@Query("SELECT a FROM Drinks a WHERE a.drink = :drink")
	List<Drinks> findKind(@Param("drink") String drink);
	
	@Query("SELECT DISTINCT a.drink FROM Drinks a")
	List<String> findDrink();

}
