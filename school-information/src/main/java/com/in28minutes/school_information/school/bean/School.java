package com.in28minutes.school_information.school.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class School 

{
   @Id
	private int schoolId;
	private String schoolName;
	private int schoolScore;
	private String principalName;

	public School(int schoolId, String schoolName, int schoolScore, String principalName) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schoolScore = schoolScore;
		this.principalName = principalName;
	}

	@Override
	public String toString() {
		return "School [schoolIdnew=" + schoolId + ", schoolName=" + schoolName + ", schoolScore=" + schoolScore
				+ ", principalName=" + principalName + "]";
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getSchoolScore() {
		return schoolScore;
	}

	public void setSchoolScore(int schoolScore) {
		this.schoolScore = schoolScore;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	


	}
