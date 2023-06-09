package in.deepak.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Citizen_plan_info")
public class CitizenPlan {

	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer citizenId;
	private String CitizenName;
	private String gender;
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benefitAmt;
	private String denialReason;
	private LocalDate terminatedDate;
	private String terminationRns;
}
