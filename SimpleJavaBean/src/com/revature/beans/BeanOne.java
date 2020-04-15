package com.revature.beans;

public class BeanOne {
public String name;
private int quantity;
private int pluid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getPluid() {
	return pluid;
}
public void setPluid(int pluid) {
	this.pluid = pluid;
}
@Override
public String toString() {
	return "BeanOne [name=" + name + ", quantity=" + quantity + ", pluid=" + pluid + "]";
}
}
