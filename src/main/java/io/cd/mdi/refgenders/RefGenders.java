package io.cd.mdi.refgenders;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ref_genders")
public class RefGenders {
	
	@Id
	@Column(name = "gender_code")
	private String genderCode;
	@Column(name = "gender_name")
	private String genderName;
	@Column(name = "created_date")
	private LocalDateTime createdDate;
	@Column(name = "updated_date")
	private LocalDateTime updatedDate;
	
	public RefGenders() {
		super();
	}

	public RefGenders(String genderCode, String genderName, LocalDateTime createdDate, LocalDateTime updatedDate) {
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
