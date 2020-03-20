package com.test.impl;

/**
 * @author wuxw
 * @since 2020/3/20
 */
public class StudentB {

	private StudentC studentC ;

	public void setStudentC(StudentC studentC) {
		this.studentC = studentC;
	}

	public StudentB() {
	}

	public StudentB(StudentC studentC) {
		this.studentC = studentC;
	}

}
