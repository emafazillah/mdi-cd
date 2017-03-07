package io.cd.mdi.refgenders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefGendersController {
	
	@Autowired
	private RefGendersService refGendersService;
	
	@RequestMapping("/refGenders")
	public List<RefGenders> getAllRefGenders() {
		return refGendersService.getAllRefGenders();
	}
	
	@RequestMapping("/refGenders/{id}")
	public RefGenders getRefGenders(@PathVariable String id) {
		return refGendersService.getRefGenders(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/refGenders")
	public void addRefGenders(@RequestBody RefGenders refGenders) {
		refGendersService.addRefGenders(refGenders);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/refGenders/{id}")
	public void updateRefGenders(@RequestBody RefGenders refGenders, @PathVariable String id) {
		refGendersService.updateRefGenders(refGenders, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/refGenders/{id}")
	public void deleteRefGenders(@PathVariable String id) {
		refGendersService.deleteRefGenders(id);
	}
	
}
