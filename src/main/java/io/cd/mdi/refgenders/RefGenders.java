package io.cd.mdi.refgenders;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RefGenders {
	
	@Id
	@Column(name = "gender_code")
	private String genderCode;
	@Column(name = "gender_name")
	private String genderName;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "updated_date")
	private Date updatedDate;
	
	public RefGenders() {
		super();
	}

	public RefGenders(String genderCode, String genderName, Date createdDate, Date updatedDate) {
		super();
		this.genderCode = genderCode;
		this.genderName = genderName;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
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
