import java.io.EOFException;

/*
 * finally : try문의 뒷처리.
 * - 예외 발생 여부와 무관하게, 반드시 수행되는 코드.
 */
public class Exception4Finally {

	public static void main(String[] args) {
		try {
			System.out.println("Exception 발생 없음.");
		} catch (Exception e) {
			System.out.println("따라서, catch문 수행 안함.");
		} finally {
			System.out.println("반드시 수행.");
		}
		//=============================================
		try {
			System.out.println("Exception 발생.");
			System.out.println(999/0);
		} catch (Exception e) {
			System.out.println("catch문 수행.");
		} finally {
			System.out.println("반드시 수행.");
		}
		//예)=============================================
		try {
			System.out.println("파일을 오픈하였으나, EOFException 발생.");
			throw new EOFException();
		} catch (Exception e) {
			System.out.println("파일이 비었습니다.\n파일을 확인 하세요.");
		} finally {
			System.out.println("파일 닫기.");
		}
	}//main

}
