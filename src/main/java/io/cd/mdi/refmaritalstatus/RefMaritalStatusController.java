package io.cd.mdi.refmaritalstatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefMaritalStatusController {

	@Autowired
	private RefMaritalStatusService refMaritalStatusService;
	
	@RequestMapping("/refMaritalStatus")
	public List<RefMaritalStatus> getAllRefMaritalStatus() {
		return refMaritalStatusService.getAllMaritalStatus();
	}
	
	@RequestMapping("/refMaritalStatus/{id}")
	public RefMaritalStatus getRefMaritalStatus(@PathVariable String id) {
		return refMaritalStatusService.getRefMaritalStatus(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/refMaritalStatus")
	public void addRefMaritalStatus(@RequestBody RefMaritalStatus refMaritalStatus) {
		refMaritalStatusService.addRefMaritalStatus(refMaritalStatus);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/refMaritalStatus/{id}")
	public void updateRefMaritalStatus(@RequestBody RefMaritalStatus refMaritalStatus, @PathVariable String id) {
		refMaritalStatusService.updateRefMaritalStatus(refMaritalStatus, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/refMaritalStatus/{id}")
	public void deleteRefMaritalStatus(@PathVariable String id) {
		refMaritalStatusService.deleteRefMaritalStatus(id);
	}
	
}
