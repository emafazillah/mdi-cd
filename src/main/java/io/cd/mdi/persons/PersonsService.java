package io.cd.mdi.persons;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonsService {

	@Autowired
	private PersonsRepository personsRepository;
	
	public List<Persons> getAllPerson() {
		List<Persons> persons = new ArrayList<>();
		personsRepository.findAll()
			.forEach(persons::add);
		return persons;
	}
	
	public Persons getPerson(long id) {
		return personsRepository.findOne(id);
	}
	
	public void addPersons(Persons persons) {
		personsRepository.save(persons);
	}
	
	public void updatePersons(long id, Persons persons) {
		personsRepository.save(persons);
	}
	
	public void deletePersons(long id) {
		personsRepository.delete(id);
	}
}
