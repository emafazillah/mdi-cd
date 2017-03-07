package io.cd.mdi.persons;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.cd.mdi.refgenders.RefGenders;

@Entity
public class Persons {
	
	@Id
	@Column(name = "person_id")
	private long personId;
	@Column(name = "person_name")	
	private String personName;
	@Column(name = "person_new_ic")
	private String personNewIc;
	@JoinColumn(name = "gender_code", referencedColumnName = "gender_code")
	@ManyToOne
	private RefGenders genderCode;
		
	public Persons() {
		super();
	}

	public Persons(long personId, String personName, String personNewIc, RefGenders genderCode) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personNewIc = personNewIc;
		this.genderCode = genderCode;
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

	public RefGenders getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(RefGenders genderCode) {
		this.genderCode = genderCode;
	}
	
}
