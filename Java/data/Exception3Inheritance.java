import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Exception 간의 상속 관계를 고려해야 함!!!
 * FileNotFoundException -> IOException -> Exception
 * - 자식 타입의 객체를 부모 타입의 변수로 받을 수 있음.
 * - Exception 객체가 IOException과 FileNotFoundException을 모두 받을 수 있음.
 * - catch문 사용시, Exception 상속에서 sub class를 위로, super class를 아래로 배치!!!
 */
public class Exception3Inheritance {

	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("aaa.txt");
		} catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException 처리");
		} catch(IOException e) {
			System.out.println("IOException의 sub class중"
					+ " FileNotFoundException이 아닌 모든 IOException 처리");
		} catch(Exception e) {
			System.out.println("모든 Exception 처리");
		}
		//=========================================
		try {
			String s = null; System.out.println(s.length());//nullpointerexception
			FileReader fr = new FileReader("aaa.txt");
		} catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException 처리");
		} catch (NullPointerException e) {
		}
		//=========================================
		try {
			String s = null; System.out.println(s.length());//nullpointerexception
			FileReader fr = new FileReader("aaa.txt");
		} catch(FileNotFoundException | NullPointerException e) {
			System.out.println("FileNotFoundException 처리");
			System.out.println("\n또는 NullPointerException 처리");
		}//하나의 catch문에서 여러 exception 처리 가능.
	}//main

}







