package com.msrweb.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	private static final String Rmanager = null;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min=3, max=50)
	@Column(name = "FNAME", nullable = false)
	private String fname;
	
	@Size(min=3, max=50)
	@Column(name = "LNAME", nullable = false)
	private String lname;

	@NotNull
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@Column(name = "DOB", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate dob;

	@NotNull
	@Digits(integer=8, fraction=2)
	@Column(name = "SALARY", nullable = false)
	private BigDecimal salary;
	
	@NotNull
	@Digits(integer=8, fraction=2)
	@Column(name = "totalExperiecne", nullable = false)
	private BigDecimal totalExperiecne;
	
	@Size(min=3, max=50)
	@Column(name = "Role", nullable = false)
	private String role;
	
	@NotNull
	@Digits(integer=8, fraction=2)
	@Column(name = "TeamlMembers")
	private BigDecimal TeamlMembers;
	
	@Size(min=3, max=50)
	@Column(name = "RManager")
	private String RManager;
	
	@NotEmpty
	@Column(name = "SSN", unique=true, nullable = false)
	private String ssn;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public BigDecimal getTotalExperiecne() {
		return totalExperiecne;
	}

	public void setTotalExperiecne(BigDecimal totalExperiecne) {
		this.totalExperiecne = totalExperiecne;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRManager() {
		return RManager;
	}

	public void setRManager(String rManager) {
		RManager = rManager;
	}

	public BigDecimal getTeamlMembers() {
		return TeamlMembers;
	}

	public void setTeamlMembers(BigDecimal teamlMembers) {
		TeamlMembers = teamlMembers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return fname;
	}

	public void setName(String name) {
		this.fname = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname= "+ lname +", dob="
				+ dob + ", salary=" + salary + ",totalExperiecne= "+totalExperiecne +", Role=" + role +", Rmanager="+Rmanager+",TeamlMembers= "+TeamlMembers+", ssn=" + ssn + "]";
	}
	
	
	

}
