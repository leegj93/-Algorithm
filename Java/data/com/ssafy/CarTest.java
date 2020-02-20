package com.ssafy;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car("1105", "아반떼", 7500000);
		Car car2 = new Bus("7777", "벤츠", 80000000, 50);
		Car car3 = new Truck("5555", "모닝", 150000, 200);
		CarMgr cmg1 = new CarMgr();
		cmg1.add(car1);
		cmg1.add(car2);
		cmg1.add(car3);
		System.out.println("현재 저장된 모든 차량 정보1 : ");
		for (int i = 0; i < cmg1.size(); i++) {
			System.out.println(cmg1.search()[i].toString());
		}
		System.out.println();

		System.out.println("파라메터로 전달된 번호와 같은 차량 정보  : 5555");
		System.out.println(cmg1.search("5555").toString());
		System.out.println();

		System.out.println("현재 저장된 모든 차량 정보2 : ");
		for (int i = 0; i < cmg1.size(); i++) {
			System.out.println(cmg1.search()[i].toString());
		}
		System.out.println();
//		System.out.println(cmg1.search()[1].toString());

		int parm_price = 7800000;
		System.out.println("파라메터로 전달된 가격보다 작은 차량 정보  : " + parm_price);
		for (int i = 0; i < cmg1.size(); i++) {
			if (cmg1.search(parm_price)[i] != null)
				System.out.println(cmg1.search(parm_price)[i].toString());
		}
		System.out.println();
		// 삭제
		String del_num = "7777";
		System.out.println("파라메터로 전달된 번호의 차량 삭제 : " + del_num);
		cmg1.delete(del_num);
//		// 삭제 확인
		System.out.println("현재 저장된 모든 차량 정보 : ");
		for (int i = 0; i < cmg1.size(); i++) {
			System.out.println(cmg1.search()[i].toString());
		}

		System.out.println();
		System.out.println("총액  : " + cmg1.totalPrice());

	}// end of main
}// end of class
