import java.util.Scanner;

import org.kiosk.menu.Menu;
import org.kiosk.menu.MenuUI;
import org.kiosk.order.OrderUI;
import org.kiosk.util.BaseUI;

public class MainUI extends BaseUI {

	private Menu menu;
	private MenuUI menuUI;
	private OrderUI orderUI;
	private Scanner scanner;

	public MainUI(MenuUI menuUI, OrderUI orderUI) {
		super();
		this.menuUI = menuUI;
		this.orderUI = orderUI;
	}

	public void welcome() {
		
			inputStr("메뉴를 보시려면 Enter");
			Menu[] menus = menuUI.showAllMenus();
			for (int i = 0; i < menus.length; i++) {
				Menu menu = menus[i];
				print("Menu[" + i + "] = " + menu.getName() + " : " + menu.getPrice());

			}

			orderUI.getOrder();
			welcome();
		
	}
}
