package org.kiosk.menu;

import java.util.Scanner;

import org.kiosk.util.BaseUI;

public class MenuUI extends BaseUI{

	// 서비스로부터 메뉴 받아서 MainUI로 보내
	
	private MenuService service;
	private Scanner scanner;
	
	public MenuUI(MenuService service) {
		super();
		this.service = service;
	}

	public Menu[] showAllMenus() {
		return service.getAllMenus();
	}
	
}
