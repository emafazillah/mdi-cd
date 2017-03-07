package io.cd.mdi.refmaritalstatus;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RefMaritalStatus {

	@Id
	@Column(name = "marital_code")
	private String maritalCode;
	@Column(name = "marital_name")
	private String maritalName;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "updated_date")
	private Date updatedDate;
	
	public RefMaritalStatus() {
		super();
	}

	public RefMaritalStatus(String maritalCode, String maritalName, Date createdDate, Date updatedDate) {
		super();
		this.maritalCode = maritalCode;
		this.maritalName = maritalName;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public String getMaritalCode() {
		return maritalCode;
	}

	public void setMaritalCode(String maritalCode) {
		this.maritalCode = maritalCode;
	}

	public String getMaritalName() {
		return maritalName;
	}

	public void setMaritalName(String maritalName) {
		this.maritalName = maritalName;
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
