package io.cd.mdi.refraces;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RefRaces {
	
	@Id
	@Column(name = "race_code")
	private String raceCode;
	@Column(name = "race_name")
	private String raceName;
	@Column(name = "nationality_status")
	private boolean nationalityStatus;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "created_date")
	private LocalDateTime createdDate;
	@Column(name = "updated_by")
	private String updatedBy;
	@Column(name = "updated_date")
	private LocalDateTime updatedDate;
	
	public RefRaces() {
		super();
	}

	public RefRaces(String raceCode, String raceName, boolean nationalityStatus, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate) {
		super();
		this.raceCode = raceCode;
		this.raceName = raceName;
		this.nationalityStatus = nationalityStatus;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public String getRaceCode() {
		return raceCode;
	}

	public void setRaceCode(String raceCode) {
		this.raceCode = raceCode;
	}

	public String getRaceName() {
		return raceName;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	public boolean isNationalityStatus() {
		return nationalityStatus;
	}

	public void setNationalityStatus(boolean nationalityStatus) {
		this.nationalityStatus = nationalityStatus;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
