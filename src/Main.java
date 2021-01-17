import java.util.Scanner;

import org.kiosk.menu.MenuDAO;
import org.kiosk.menu.MenuService;
import org.kiosk.menu.MenuUI;
import org.kiosk.order.OrderUI;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		MenuDAO dao = new MenuDAO();
		
		MenuService service = new MenuService(dao);
		
		MenuUI menuUI = new MenuUI(service);
		menuUI.setScanner(scanner);
	
		OrderUI orderUI = new OrderUI(service);
		orderUI.setScanner(scanner);
		MainUI ui = new MainUI(menuUI , orderUI);
		ui.setScanner(scanner);
		
		ui.welcome();
	}
}
