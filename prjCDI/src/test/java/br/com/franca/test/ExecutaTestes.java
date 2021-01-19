package br.com.franca.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecutaTestes {
	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(UtilidadesTests.class);

		for (Failure fail : runClasses.getFailures()) {
			System.out.println(fail.toString());
		}
	}
}
