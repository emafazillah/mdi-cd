package io.cd.mdi.persons;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.cd.mdi.refgenders.RefGenders;
import io.cd.mdi.refmaritalstatus.RefMaritalStatus;
import io.cd.mdi.refnations.RefNations;

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
	@JoinColumn(name = "nation_code", referencedColumnName = "nation_code")
	@ManyToOne
	private RefNations nationCode;
	@JoinColumn(name = "marital_code", referencedColumnName = "marital_code")
	@ManyToOne
	private RefMaritalStatus maritalCode;
		
	public Persons() {
		super();
	}

	public Persons(long personId, String personName, String personNewIc, RefGenders genderCode, RefNations nationCode, RefMaritalStatus maritalCode) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personNewIc = personNewIc;
		this.genderCode = genderCode;
		this.nationCode = nationCode;
		this.maritalCode = maritalCode;
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

	public RefNations getNationCode() {
		return nationCode;
	}

	public void setNationCode(RefNations nationCode) {
		this.nationCode = nationCode;
	}

	public RefMaritalStatus getMaritalCode() {
		return maritalCode;
	}

	public void setMaritalCode(RefMaritalStatus maritalCode) {
		this.maritalCode = maritalCode;
	}
	
}
