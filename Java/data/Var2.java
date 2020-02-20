
public class Var2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 =-128;
		byte b2 =127;
		System.out.println(b1);
		System.out.println(b2);
		byte b3 = (byte) 128; // demotion
		byte b4 = (byte) 129;
		System.out.println(b3);
		System.out.println(b4);
		int i = b2;// auto casting, promotion
		System.out.println(i);

	}

}
