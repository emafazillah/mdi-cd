package io.cd.mdi.refmaritalstatus;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefMaritalStatusService {

	@Autowired
	private RefMaritalStatusRepository refMaritalStatusRepository;
	
	public List<RefMaritalStatus> getAllMaritalStatus() {
		List<RefMaritalStatus> refMaritalStatusList = new ArrayList<>();
		refMaritalStatusRepository.findAll()
			.forEach(refMaritalStatusList::add);
		return refMaritalStatusList; 
	}
	
	public RefMaritalStatus getRefMaritalStatus(String id) {
		return refMaritalStatusRepository.findOne(id);
	}
	
	public void addRefMaritalStatus(RefMaritalStatus refMaritalStatus) {
		refMaritalStatusRepository.save(refMaritalStatus);
	}
	
	public void updateRefMaritalStatus(RefMaritalStatus refMaritalStatus, String id) {
		refMaritalStatusRepository.save(refMaritalStatus);
	}
	
	public void deleteRefMaritalStatus(String id) {
		refMaritalStatusRepository.delete(id);
	}
	
}
