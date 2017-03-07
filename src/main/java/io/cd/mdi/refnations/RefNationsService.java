package io.cd.mdi.refnations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefNationsService {

	@Autowired
	private RefNationsRepository refNationsRepository;
	
	public List<RefNations> getAllNations() {
		List<RefNations> refNationsList = new ArrayList<>();
		refNationsRepository.findAll()
			.forEach(refNationsList::add);
		return refNationsList;
	}
	
	public RefNations getRefNations(String id) {
		return refNationsRepository.findOne(id);
	}
	
	public void addRefNations(RefNations refNations) {
		refNationsRepository.save(refNations);
	}
	
	public void updateRefNations(RefNations refNations, String id) {
		refNationsRepository.save(refNations);
	}
	
	public void deleteRefNations(String id) {
		refNationsRepository.delete(id);
	}
	
}
