package com.example.model;

public class StudentParentVo {

	private int studentId;
	private String studentName;
	private long studentMobile;
	private String studentCourse;
	private int studentFees;
	private int parentId;
	private String parentName;
	private String parentAddress;
	private long parentMobile;
	private int parentAge;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public int getStudentFees() {
		return studentFees;
	}

	public void setStudentFees(int studentFees) {
		this.studentFees = studentFees;
	}

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

	@Override
	public String toString() {
		return "StudentParentVo [studentId=" + studentId + ", studentName=" + studentName + ", studentMobile="
				+ studentMobile + ", studentCourse=" + studentCourse + ", studentFees=" + studentFees + ", parentId="
				+ parentId + ", parentName=" + parentName + ", parentAddress=" + parentAddress + ", parentMobile="
				+ parentMobile + ", parentAge=" + parentAge + "]";
	}

}
