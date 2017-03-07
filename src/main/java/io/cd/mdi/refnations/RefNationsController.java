package io.cd.mdi.refnations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefNationsController {

	@Autowired
	private RefNationsService refNationsService;
	
	@RequestMapping("/refNations")
	public List<RefNations> getAllRefNations() {
		return refNationsService.getAllNations();
	}
	
	@RequestMapping("/refNations/{id}")
	public RefNations getRefNations(String id) {
		return refNationsService.getRefNations(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/refNations")
	public void addRefNations(@RequestBody RefNations refNations) {
		refNationsService.addRefNations(refNations);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/refNations/{id}")
	public void updateRefNations(@RequestBody RefNations refNations, @PathVariable String id) {
		refNationsService.updateRefNations(refNations, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/refNations/{id}")
	public void deleteRefNations(@PathVariable String id) {
		refNationsService.deleteRefNations(id);
	}
	
}
