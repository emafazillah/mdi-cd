package io.cd.mdi.persons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonsController {
	
	@Autowired
	private PersonsService personsService;

	@RequestMapping("/persons")
	public List<Persons> getAllPersons() {
		return personsService.getAllPerson();
	}
	
	@RequestMapping("/persons/{id}")
	public Persons getPerson(@PathVariable long id) {
		return personsService.getPerson(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/persons")
	public void addPerson(@RequestBody Persons persons) {
		personsService.addPersons(persons);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/persons/{id}")
	public void updatePerson(@RequestBody Persons persons, @PathVariable long id) {
		personsService.updatePersons(id, persons);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/persons/{id}")
	public void deletePerson(@PathVariable long id) {
		personsService.deletePersons(id);
	}
}
