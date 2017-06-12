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

import edenbar.models.Drinks;
import edenbar.repositories.DrinkRepository;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ebar/drinks")
public class DrinkController {
	@Autowired
	DrinkRepository dr;

	@RequestMapping(method = RequestMethod.GET)
	public List<String> listDrinks() {

		List<String> drinks = new ArrayList<>();
		Iterable<String> it = dr.findDrink();
		Iterator<String> iterator = it.iterator();
		while (iterator.hasNext()) {
			drinks.add(iterator.next());
		}
		return drinks;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/kind/{drink}")
    public List<Drinks> findKind(@PathVariable String drink) {
		List<Drinks> drinks = new ArrayList<>();
		Iterable<Drinks> it = dr.findKind(drink);
		Iterator<Drinks> iterator = it.iterator();
		while (iterator.hasNext()) {
			drinks.add(iterator.next());
		}
		return drinks;
    }
}
