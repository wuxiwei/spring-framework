package com.test.impl;

/**
 * @author wuxw
 * @since 2020/3/20
 */
public class StudentA {

	private StudentB studentB ;

	public void setStudentB(StudentB studentB) {
		this.studentB = studentB;
	}

	public StudentA() {
	}

	public StudentA(StudentB studentB) {
		this.studentB = studentB;
	}

}
