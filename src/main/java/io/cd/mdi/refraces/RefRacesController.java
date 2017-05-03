package io.cd.mdi.refraces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefRacesController {

	@Autowired
	private RefRacesService refRacesService;
	
	@RequestMapping("/refRaces")
	public List<RefRaces> getAllRaces() {		
		return refRacesService.getAllRaces();
	}
	
	@RequestMapping("/refRaces/{id}")
	public RefRaces getRefRaces(@PathVariable String id) {
		return refRacesService.getRefRaces(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/refRaces")
	public void addRefRaces(@RequestBody RefRaces refRaces) {
		refRacesService.addRefRaces(refRaces);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/refRaces/{id}")
	public void updateRefRaces(@RequestBody RefRaces refRaces, @PathVariable String id) {
		refRacesService.updateRefRaces(refRaces, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/refRaces/{id}")
	public void deleteRefRaces(String id) {
		refRacesService.deleteRefRaces(id);
	}
	
}
