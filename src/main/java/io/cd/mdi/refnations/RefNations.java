package io.cd.mdi.refnations;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ref_nations")
public class RefNations {

	@Id
	@Column(name = "nation_code")
	private String nationCode;
	@Column(name = "nation_name")
	private String nationName;
	@Column(name = "nation_nationality")
	private String nationNationality;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "updated_date")
	private Date updatedDate;
	
	public RefNations() {
		super();
	}

	public RefNations(String nationCode, String nationName, String nationNationality, Date createdDate, Date updatedDate) {
		super();
		this.nationCode = nationCode;
		this.nationName = nationName;
		this.nationNationality = nationNationality;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public String getNationCode() {
		return nationCode;
	}

	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
	}

	public String getNationName() {
		return nationName;
	}

	public void setNationName(String nationName) {
		this.nationName = nationName;
	}

	public String getNationNation() {
		return nationNationality;
	}

	public void setNationNation(String nationNationality) {
		this.nationNationality = nationNationality;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
