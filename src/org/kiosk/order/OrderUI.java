package org.kiosk.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.kiosk.menu.Menu;
import org.kiosk.menu.MenuService;
import org.kiosk.util.BaseUI;

public class OrderUI extends BaseUI {

	// 주문을 화면과 소통
	private MenuService service;
	

	public OrderUI(MenuService service) {
		super();
		this.service = service;
	}

	public void getOrder() {
		
		ArrayList<OrderItem> items = new ArrayList<>();

		while (true) {
			
			int menuNum = inputInt("주문하실 메뉴의 번호를 입력하세요");
			Menu menu = service.getMenu(menuNum);
			int qty = inputInt("수량을 입력해주세요");
			
			OrderItem orderItem = new OrderItem( menu ,qty);
			
			items.add(orderItem);
			
			print("주문을 계속하시려면 Enter");
			String answer = inputStr("주문을 그만하시려면 n , 더하시려면 Enter");
			if(answer.equals("n")) {
				break;
			}
		} // end while
		
		Order order = new Order(items);
		
		print("OrderNum: " + order.getOrderNum() );
		
		print("===========================");
		print("===========================");
		for (OrderItem orderItem : items) {
			print(orderItem.getMenu()+"수량: "+orderItem.getQty()+",가격: "+orderItem.getItemPrice());
		}
		print("Total: "+ order.getTotal());
		
	}

}
