package org.kiosk.order;

import org.kiosk.menu.Menu;

public class OrderItem {

	private Menu menu;
	private int qty;
	
	public OrderItem(Menu menu, int qty) {
		super();
		this.menu = menu;
		this.qty = qty;
	}

	public int getItemPrice() {
		return Integer.parseInt(menu.getPrice()) * qty;
	}
	
	public Menu getMenu() {
		return menu;
	}
	
	public int getQty() {
		return qty;
	}



	@Override
	public String toString() {
		return "OrderItem [menu=" + menu + ", qty=" + qty + "]";
	}
	
	
	
}
