package io.cd.mdi.refmaritalstatus;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ref_marital_status")
public class RefMaritalStatus {

	@Id
	@Column(name = "marital_code")
	private String maritalCode;
	@Column(name = "marital_name")
	private String maritalName;
	@Column(name = "created_date")
	private LocalDateTime createdDate;
	@Column(name = "updated_date")
	private LocalDateTime updatedDate;
	
	public RefMaritalStatus() {
		super();
	}

	public RefMaritalStatus(String maritalCode, String maritalName, LocalDateTime createdDate, LocalDateTime updatedDate) {
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

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
