/*
 * throw : Exception을 발생 시키는 표현.
 * throws : Exception을 Exception이 발생한 코드를 호출한 놈에게 떠넘기는 표현.
 * - 호출한 곳에서 처리하라.
 */
public class Exception5Throws {
	public void throwNullPointer() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("Exception 발생 지점에서 처리.");
		}
	}
	public void idCheck(String id) throws NullPointerException {
		if(!id.equals("SSAFY")) {
			throw new NullPointerException();
		}
	}
	public static void main(String[] args) {
		Exception5Throws e5 = new Exception5Throws();
		e5.throwNullPointer();
		try {
			e5.idCheck("ssafy");
		} catch (NullPointerException e) {
			System.out.println("존재하지 않는 ID 입니다.");
			System.out.println("Exception 호출한 지점에서 처리.");
		}
	}

}
