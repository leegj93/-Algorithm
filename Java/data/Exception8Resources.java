/**
 * try문에서 자원을 자동 해제하는 방법(자바 7버젼부터 사용가능)
 * @author multicampus
 *
 */
class AutoCloseTest implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("자동 자원 해제");
	}
}

public class Exception8Resources {
	public static void main(String[] args) {
		try (AutoCloseTest at = new AutoCloseTest()){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
