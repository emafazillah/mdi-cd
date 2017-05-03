package io.cd.mdi.refraces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefRacesService {

	@Autowired
	private RefRacesRepository refRacesRepository;
	
	public List<RefRaces> getAllRaces() {
		List<RefRaces> refRacesList = new ArrayList<>();
		refRacesRepository.findAll()
			.forEach(refRacesList::add);
		return refRacesList;
	}
	
	public RefRaces getRefRaces(String id) {
		return refRacesRepository.findOne(id);
	}
	
	public void addRefRaces(RefRaces refRaces) {
		refRacesRepository.save(refRaces);
	}
	
	public void updateRefRaces(RefRaces refRaces, String id) {
		refRacesRepository.save(refRaces);
	}
	
	public void deleteRefRaces(String id) {
		refRacesRepository.delete(id);
	}
	
}
