package com.revature.driver;
import com.revature.beans.*;
public class Driver {

	public static void main(String[] args) {
//		Driver for Bean 1
		BeanOne b = new BeanOne();
		b.name = "Pinto";
		System.out.println(b);
		b.setName("Pinto");
		b.setQuantity(5);
		b.setPluid(1);
		System.out.println(b.getName());
				
//		Driver for Bean 2
		BeanTwo c = new BeanTwo();
		c.name = "Black";
		System.out.println(c);
		c.setName("Black");
		c.setQuantity(7);
		c.setPluid(2);
		System.out.println(c.getName());

	}

}
