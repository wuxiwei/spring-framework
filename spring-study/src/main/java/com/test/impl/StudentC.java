package com.test.impl;

/**
 * @author wuxw
 * @since 2020/3/20
 */
public class StudentC {

	private StudentA studentA ;

	public void setStudentA(StudentA studentA) {
		this.studentA = studentA;
	}

	public StudentC() {
	}

	public StudentC(StudentA studentA) {
		this.studentA = studentA;
	}

}
