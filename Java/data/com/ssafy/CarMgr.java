package com.ssafy;

public class CarMgr {
	private static Car[] cars= new Car[100];
	private static int index=0;
	
	public void add(Car c) {
		cars[index++]=c;
	}
	public Car[] search() {
		return cars;
		
	}
	public Car search(String num) {
		Car Search_list= new Car();
		for (int i = 0; i < index; i++) {
			if(cars[i].getNum().equals(num)) {
				Search_list=cars[i];
			}
		}
		return Search_list;
	}
	public Car[] search(int price) {
		Car[] Search_price = new Car[index];
		int idx=0;
		for (int i = 0; i < index; i++) {
			if(cars[i].getPrice()<=price) {
				Search_price[i]=cars[i];
			}else {
				Search_price[i]=null;
			}
			
		}
		return Search_price;
	}
	public void update(String num, int price) {
		for (int i = 0; i < index; i++) {
			if(cars[i].getNum().equals(num)) {
				cars[i].setPrice(price);
			}
		}
		
	}
	public void delete(String num) {
		int i;
		boolean toggle= false;
		for (i = 0; i < index; i++) {
			if(cars[i].getNum().equals(num)) {
				toggle = true;
				break;
			}
		}
		if(toggle) {
			for (; i < index; i++) {
				cars[i]=cars[i+1];
			}
			index--;
		}
	}
	public int size() {
		int size =index;
		return size;
	}
	public int totalPrice() {
		int sum=0;
		for (int i = 0; i < index; i++) {
			sum+=cars[i].getPrice();
		}
		return sum;
		
	}
}
