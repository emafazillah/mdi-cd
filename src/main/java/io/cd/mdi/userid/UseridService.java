package io.cd.mdi.userid;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseridService {
	
	@Autowired
	private UseridRepository useridRepository;
	
	public List<Userid> getAllUserid() {
		List<Userid> useridRepositoryList = new ArrayList<>();
		useridRepository.findAll()
			.forEach(useridRepositoryList::add);		
		return useridRepositoryList;
	}
	
	public Userid getUserid(String id) {
		return useridRepository.findOne(id);
	}
	
	public void addUserid(Userid userid) {
		useridRepository.save(userid);
	}
	
	public void updateUserid(Userid userid, String id) {
		useridRepository.save(userid);
	}
	
	public void deleteUserid(String id){
		useridRepository.delete(id);
	}

}
