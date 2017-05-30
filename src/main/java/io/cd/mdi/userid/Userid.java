package io.cd.mdi.userid;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userid")
public class Userid {
		
	@Column(name = "uid_staffno")
	private String uidStaffno;
	@Column(name = "uid_costcentre")
	private String uidCostcentre;
	@Id
	@Column(name = "uid_userid")
	private String uidUserid;
	@Column(name = "uid_password")
	private String uidPassword;
	@Column(name = "uid_currentsts")
	private String uidCurrentsts;
	@Column(name = "uid_modulelevel")
	private String uidModulelevel;
	@Column(name = "uid_accesslevel")
	private String uidAccesslevel;
	@Column(name = "uid_userlevel")
	private String uidUserlevel;
	@Column(name = "uid_useridsts")
	private String uidUseridsts;
	@Column(name = "uid_email")
	private String uidEmail;
	@Column(name = "uid_idno")
	private String uidIdno;
	@Column(name = "uid_staffname")
	private String uidStaffname;
	@Column(name = "uid_effdate")
	private LocalDateTime uidEffdate;
	@Column(name = "uid_minutiae")
	private String uidMinutiae;
	@Column(name = "uid_verificationtype")
	private String uidVerificationtype;
	@Column(name = "uid_createuser")
	private String uidCreateuser;
	@Column(name = "uid_createdate")
	private LocalDateTime uidCreatedate;
	@Column(name = "uid_updateuser")
	private String uidUpdateuser;
	@Column(name = "uid_updatedate")
	private LocalDateTime uidUpdatedate;
	@Column(name = "uid_recordsts")
	private String uidRecordsts;
	@Column(name = "uid_changepwd")
	private String uidChangepwd;
	@Column(name = "uid_location")
	private String uidLocation;
	@Column(name = "supervisor_id")
	private String supervisorId;
	@Column(name = "loginstatus")
	private Boolean loginstatus;
	@Column(name = "uid_designation")
	private String uidDesignation;
	@Column(name = "uid_activests")
	private Boolean uidActivests;
	@Column(name = "uid_mmc")
	private Long uidMmc;
	@Column(name = "uid_useric")
	private String uidUseric;
	@Column(name = "uid_passport")
	private String uidPassport;
	@Column(name = "cas_status")
	private Boolean casStatus;
	@Column(name = "discipline_code")
	private String disciplineCode;
	@Column(name = "reshuffle_status")
	private String reshuffleStatus;
	@Column(name = "transfer_out_status")
	private String transferOutStatus;
	
	public Userid() {
		super();
	}

	public Userid(String uidStaffno, String uidCostcentre, String uidUserid, String uidPassword, String uidCurrentsts,
			String uidModulelevel, String uidAccesslevel, String uidUserlevel, String uidUseridsts, String uidEmail,
			String uidIdno, String uidStaffname, LocalDateTime uidEffdate, String uidMinutiae, String uidVerificationtype,
			String uidCreateuser, LocalDateTime uidCreatedate, String uidUpdateuser, LocalDateTime uidUpdatedate, String uidRecordsts,
			String uidChangepwd, String uidLocation, String supervisorId, Boolean loginstatus, String uidDesignation,
			Boolean uidActivests, Long uidMmc, String uidUseric, String uidPassport, Boolean casStatus,
			String disciplineCode, String reshuffleStatus, String transferOutStatus) {
		super();
		this.uidStaffno = uidStaffno;
		this.uidCostcentre = uidCostcentre;
		this.uidUserid = uidUserid;
		this.uidPassword = uidPassword;
		this.uidCurrentsts = uidCurrentsts;
		this.uidModulelevel = uidModulelevel;
		this.uidAccesslevel = uidAccesslevel;
		this.uidUserlevel = uidUserlevel;
		this.uidUseridsts = uidUseridsts;
		this.uidEmail = uidEmail;
		this.uidIdno = uidIdno;
		this.uidStaffname = uidStaffname;
		this.uidEffdate = uidEffdate;
		this.uidMinutiae = uidMinutiae;
		this.uidVerificationtype = uidVerificationtype;
		this.uidCreateuser = uidCreateuser;
		this.uidCreatedate = uidCreatedate;
		this.uidUpdateuser = uidUpdateuser;
		this.uidUpdatedate = uidUpdatedate;
		this.uidRecordsts = uidRecordsts;
		this.uidChangepwd = uidChangepwd;
		this.uidLocation = uidLocation;
		this.supervisorId = supervisorId;
		this.loginstatus = loginstatus;
		this.uidDesignation = uidDesignation;
		this.uidActivests = uidActivests;
		this.uidMmc = uidMmc;
		this.uidUseric = uidUseric;
		this.uidPassport = uidPassport;
		this.casStatus = casStatus;
		this.disciplineCode = disciplineCode;
		this.reshuffleStatus = reshuffleStatus;
		this.transferOutStatus = transferOutStatus;
	}

	public String getUidStaffno() {
		return uidStaffno;
	}

	public void setUidStaffno(String uidStaffno) {
		this.uidStaffno = uidStaffno;
	}

	public String getUidCostcentre() {
		return uidCostcentre;
	}

	public void setUidCostcentre(String uidCostcentre) {
		this.uidCostcentre = uidCostcentre;
	}

	public String getUidUserid() {
		return uidUserid;
	}

	public void setUidUserid(String uidUserid) {
		this.uidUserid = uidUserid;
	}

	public String getUidPassword() {
		return uidPassword;
	}

	public void setUidPassword(String uidPassword) {
		this.uidPassword = uidPassword;
	}

	public String getUidCurrentsts() {
		return uidCurrentsts;
	}

	public void setUidCurrentsts(String uidCurrentsts) {
		this.uidCurrentsts = uidCurrentsts;
	}

	public String getUidModulelevel() {
		return uidModulelevel;
	}

	public void setUidModulelevel(String uidModulelevel) {
		this.uidModulelevel = uidModulelevel;
	}

	public String getUidAccesslevel() {
		return uidAccesslevel;
	}

	public void setUidAccesslevel(String uidAccesslevel) {
		this.uidAccesslevel = uidAccesslevel;
	}

	public String getUidUserlevel() {
		return uidUserlevel;
	}

	public void setUidUserlevel(String uidUserlevel) {
		this.uidUserlevel = uidUserlevel;
	}

	public String getUidUseridsts() {
		return uidUseridsts;
	}

	public void setUidUseridsts(String uidUseridsts) {
		this.uidUseridsts = uidUseridsts;
	}

	public String getUidEmail() {
		return uidEmail;
	}

	public void setUidEmail(String uidEmail) {
		this.uidEmail = uidEmail;
	}

	public String getUidIdno() {
		return uidIdno;
	}

	public void setUidIdno(String uidIdno) {
		this.uidIdno = uidIdno;
	}

	public String getUidStaffname() {
		return uidStaffname;
	}

	public void setUidStaffname(String uidStaffname) {
		this.uidStaffname = uidStaffname;
	}

	public LocalDateTime getUidEffdate() {
		return uidEffdate;
	}

	public void setUidEffdate(LocalDateTime uidEffdate) {
		this.uidEffdate = uidEffdate;
	}

	public String getUidMinutiae() {
		return uidMinutiae;
	}

	public void setUidMinutiae(String uidMinutiae) {
		this.uidMinutiae = uidMinutiae;
	}

	public String getUidVerificationtype() {
		return uidVerificationtype;
	}

	public void setUidVerificationtype(String uidVerificationtype) {
		this.uidVerificationtype = uidVerificationtype;
	}

	public String getUidCreateuser() {
		return uidCreateuser;
	}

	public void setUidCreateuser(String uidCreateuser) {
		this.uidCreateuser = uidCreateuser;
	}

	public LocalDateTime getUidCreatedate() {
		return uidCreatedate;
	}

	public void setUidCreatedate(LocalDateTime uidCreatedate) {
		this.uidCreatedate = uidCreatedate;
	}

	public String getUidUpdateuser() {
		return uidUpdateuser;
	}

	public void setUidUpdateuser(String uidUpdateuser) {
		this.uidUpdateuser = uidUpdateuser;
	}

	public LocalDateTime getUidUpdatedate() {
		return uidUpdatedate;
	}

	public void setUidUpdatedate(LocalDateTime uidUpdatedate) {
		this.uidUpdatedate = uidUpdatedate;
	}

	public String getUidRecordsts() {
		return uidRecordsts;
	}

	public void setUidRecordsts(String uidRecordsts) {
		this.uidRecordsts = uidRecordsts;
	}

	public String getUidChangepwd() {
		return uidChangepwd;
	}

	public void setUidChangepwd(String uidChangepwd) {
		this.uidChangepwd = uidChangepwd;
	}

	public String getUidLocation() {
		return uidLocation;
	}

	public void setUidLocation(String uidLocation) {
		this.uidLocation = uidLocation;
	}

	public String getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	public Boolean isLoginstatus() {
		return loginstatus;
	}

	public void setLoginstatus(Boolean loginstatus) {
		this.loginstatus = loginstatus;
	}

	public String getUidDesignation() {
		return uidDesignation;
	}

	public void setUidDesignation(String uidDesignation) {
		this.uidDesignation = uidDesignation;
	}

	public Boolean isUidActivests() {
		return uidActivests;
	}

	public void setUidActivests(Boolean uidActivests) {
		this.uidActivests = uidActivests;
	}

	public Long getUidMmc() {
		return uidMmc;
	}

	public void setUidMmc(Long uidMmc) {
		this.uidMmc = uidMmc;
	}

	public String getUidUseric() {
		return uidUseric;
	}

	public void setUidUseric(String uidUseric) {
		this.uidUseric = uidUseric;
	}

	public String getUidPassport() {
		return uidPassport;
	}

	public void setUidPassport(String uidPassport) {
		this.uidPassport = uidPassport;
	}

	public Boolean isCasStatus() {
		return casStatus;
	}

	public void setCasStatus(Boolean casStatus) {
		this.casStatus = casStatus;
	}

	public String getDisciplineCode() {
		return disciplineCode;
	}

	public void setDisciplineCode(String disciplineCode) {
		this.disciplineCode = disciplineCode;
	}

	public String getReshuffleStatus() {
		return reshuffleStatus;
	}

	public void setReshuffleStatus(String reshuffleStatus) {
		this.reshuffleStatus = reshuffleStatus;
	}

	public String getTransferOutStatus() {
		return transferOutStatus;
	}

	public void setTransferOutStatus(String transferOutStatus) {
		this.transferOutStatus = transferOutStatus;
	}
	
}
