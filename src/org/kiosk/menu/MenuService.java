package org.kiosk.menu;

public class MenuService {

	// 메뉴를 DAO에서 받아서 UI에 넘긴다
	private MenuDAO dao;

	public MenuService(MenuDAO dao) {
		super();
		this.dao = dao;
	}
	

	// UI에 메뉴를 준다
	public Menu[] getAllMenus() {
		return dao.getDatabase();
	}
	
	// 번호에 맞는 메뉴를 보내준다
	public Menu getMenu(int index) {
		return dao.getDatabase()[index];
	}
	
}
