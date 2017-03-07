package io.cd.mdi.refgenders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefGendersService {

	@Autowired
	private RefGendersRepository refGendersRepository;
	
	public List<RefGenders> getAllRefGenders() {
		List<RefGenders> refGendersList = new ArrayList<>();
		refGendersRepository.findAll()
			.forEach(refGendersList::add);
		return refGendersList;
	}
	
	public RefGenders getRefGenders(String id) {
		return refGendersRepository.findOne(id);
	}
	
	public void addRefGenders(RefGenders refGenders) {
		refGendersRepository.save(refGenders);
	}
	
	public void updateRefGenders(RefGenders refGenders, String id) {
		refGendersRepository.save(refGenders);
	}
	
	public void deleteRefGenders(String id) {
		refGendersRepository.delete(id);
	}
	
}
