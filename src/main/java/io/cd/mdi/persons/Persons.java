package io.cd.mdi.persons;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persons {
	
	@Id
	@Column(name = "person_id")
	private long personId;
	@Column(name = "person_name")	
	private String personName;
	@Column(name = "person_new_ic")
	private String personNewIc;
		
	public Persons() {
		super();
	}

	public Persons(long personId, String personName, String personNewIc) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personNewIc = personNewIc;
	}

	public long getPersonId() {
		return personId;
	}
	
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getPersonNewIc() {
		return personNewIc;
	}
	
	public void setPersonNewIc(String personNewIc) {
		this.personNewIc = personNewIc;
	}
	
}
