package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="PLAN_MASTER")
public class Plan {
	
	@Id
	@GeneratedValue
	@Column(name="PLAN_ID")
	private Integer planId;
	
	@Column(name="PLAN_NAME")
	private String planName;
	
	@Column(name="PLAN_START_DATE")
	private LocalDate planStartDate;
	
	@Column(name="PLAN_END_DATE")
	private LocalDate planEndDate;
	
	@Column(name="PLAN_CATEGORY_ID")
	private Integer plaCategoryId;
	
	@Column(name="ACTIVE_SW")
	private String activeSw;
	
	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "CREATE_DATE", updatable = false)
	@CreationTimestamp
	private LocalDate createDate;

	@Column(name = "UPDATE_DATE", insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public LocalDate getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}

	public LocalDate getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}

	public Integer getPlaCategoryId() {
		return plaCategoryId;
	}

	public void setPlaCategoryId(Integer plaCategoryId) {
		this.plaCategoryId = plaCategoryId;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	
	

}
