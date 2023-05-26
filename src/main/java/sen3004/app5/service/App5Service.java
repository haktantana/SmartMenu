package sen3004.app5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sen3004.app5.dao.App5Repository;
import sen3004.app5.model.Order;
import sen3004.app5.model.Person;

@Service
public class App5Service {

	@Autowired
	private App5Repository repository;

	public List<Person> findAll() {
		return repository.findAll();
	}

	public Person findById(long id) {
		return repository.findById(id);
	}

	public void create(Person person) {
		repository.create(person);
	}

	public void delete(long id) {
		repository.delete(id);
	}


	public List<Order> findAll2() {
		return repository.findAll2();
	}

	public Order findById2(long id) {
		return repository.findById2(id);
	}

	public void create(Order order) {
		repository.create(order);
	}

	public void entertable(Order order){
		repository.entertable(order);
	}

	public void delete2(long id) {
		repository.delete2(id);
	}

	public void deleteall(){
		repository.deleteall();
	}

}
