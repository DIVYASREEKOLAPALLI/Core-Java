package com.version4;

public interface University {
	void infra();
	default void questionPaper() {
		System.out.println("QP from university");
	}
	
	static void sfRatio() {
		System.out.println("20:1");
	}

}
