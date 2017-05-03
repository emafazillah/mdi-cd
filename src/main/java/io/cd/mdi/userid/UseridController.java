package io.cd.mdi.userid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UseridController {
	
	@Autowired
	private UseridService useridService;
	
	@RequestMapping("/userid")
	public List<Userid> getAllUserid() {
		return useridService.getAllUserid();
	}
	
	@RequestMapping("/userid/{id}")
	public Userid getUserid(@PathVariable String id){
		return useridService.getUserid(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/userid")
	public void addUserid(@RequestBody Userid userid) {
		useridService.addUserid(userid);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/userid/{id}")
	public void updateUserid(@RequestBody Userid userid, @PathVariable String id) {
		useridService.updateUserid(userid, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/userid/{id}")
	public void deleteUserid(@PathVariable String id) {
		useridService.deleteUserid(id);
	}

}
