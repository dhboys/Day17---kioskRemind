package org.kiosk.order;

import java.util.ArrayList;

public class Order {

	public static int Count = 0;
	
	private int orderNum;
	private ArrayList<OrderItem> items = new ArrayList<>();
	
	
	public Order(ArrayList<OrderItem> items) {
		super();
		this.orderNum = ++Count;
		this.items = items;
	}

	public static int getCount() {
		return Count;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public ArrayList<OrderItem> getItems() {
		return items;
	}




	// 주문한 아이템의 총 가격
	public int getTotal() {
		int total = 0;
		
		for (OrderItem orderItem : items) {
			
			total = total + orderItem.getItemPrice();
		}
		
		return total;
	}
	
}
