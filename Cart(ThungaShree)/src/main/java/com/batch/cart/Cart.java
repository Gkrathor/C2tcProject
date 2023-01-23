package com.batch.cart;

public class Cart {
	private int cart_id;
	private int timestamp;
	private int item_id;
	private String item_name;
	private String item_description;
	private int item_price;
	private int quality;
	private int cart_subtotal;
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_description() {
		return item_description;
	}
	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public int getCart_subtotal() {
		return cart_subtotal;
	}
	public void setCart_subtotal(int cart_subtotal) {
		this.cart_subtotal = cart_subtotal;
	}
	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", timestamp=" + timestamp + ", item_id=" + item_id + ", item_name="
				+ item_name + ", item_description=" + item_description + ", item_price=" + item_price + ", quality="
				+ quality + ", cart_subtotal=" + cart_subtotal + "]";
	}
	
}
