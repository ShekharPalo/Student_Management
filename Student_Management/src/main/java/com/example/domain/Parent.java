package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parent")
public class Parent {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int parentId;

	@Column(name = "parentName")
	private String parentName;

	@Column(name = "parentAddress")
	private String parentAddress;

	@Column(name = "parentMobile")
	private long parentMobile;

	@Column(name = "parentAge")
	private int parentAge;

	@Column(name = "stdId")
	private Student stdId;

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentAddress() {
		return parentAddress;
	}

	public void setParentAddress(String parentAddress) {
		this.parentAddress = parentAddress;
	}

	public long getParentMobile() {
		return parentMobile;
	}

	public void setParentMobile(long parentMobile) {
		this.parentMobile = parentMobile;
	}

	public int getParentAge() {
		return parentAge;
	}

	public void setParentAge(int parentAge) {
		this.parentAge = parentAge;
	}

	public Student getstdId() {
		return stdId;
	}

	public void setstdId(Student stdId) {
		this.stdId = stdId;
	}

	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", parentName=" + parentName + ", parentAddress=" + parentAddress
				+ ", parentMobile=" + parentMobile + ", parentAge=" + parentAge + ", stdId=" + stdId + "]";
	}

	/*
	 * @PrimaryKeyJoinColumn(name = "studentId")
	 *
	 * @SecondaryTable(name = "student", pkJoinColumns = @PrimaryKeyJoinColumn(name
	 * = "studentId", referencedColumnName = "studentId"))
	 */

}