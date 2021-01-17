package org.kiosk.util;

import java.util.Scanner;

public class BaseUI {

	Scanner scanner;

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
	protected void print(String msg) {
		System.out.println(msg);
	}
	
	protected String inputStr(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
	}
	
	protected int inputInt( String msg) {
		System.out.println(msg);
		return Integer.parseInt(scanner.nextLine());
	}
	
	protected double inputDouble( String msg) {
		System.out.println(msg);
		return Double.parseDouble(scanner.nextLine());
	}
	
}
