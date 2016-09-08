package org.cap.bankapp.test;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class TestRunners {

	public static void main(String[] args) {
		
		JUnitCore unitcore=new JUnitCore();
		unitcore.addListener(new TextListener(System.out));
		unitcore.run(BankAppTestCase.class);
		

	}

}
