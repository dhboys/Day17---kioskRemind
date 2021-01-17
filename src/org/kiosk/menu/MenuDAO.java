package org.kiosk.menu;

import java.io.File;
import java.util.Scanner;

public class MenuDAO {

	// 메뉴 정보들을 DB에서부터 받아오는 역할
	private Menu[] menus = new Menu[5];

	public MenuDAO() {
		try {
			File file = new File("C:\\zzz\\kiosk.txt");
			// 스캐너로 읽어옴
			Scanner scanner = new Scanner(file, "UTF-8");
			// 읽어온거 분리
			for (int i = 0; i < menus.length; i++) {
				String line = scanner.nextLine();
				String[] arr = line.split(":");
				menus[i] = new Menu(arr[0] , arr[1]);
			} // end for
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end MenuDAO

	public Menu[] getDatabase() {
		return menus;
	}
	
}
