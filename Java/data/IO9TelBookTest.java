import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
class OOTestVO2 implements Serializable{
	private String name;
	private String telNo;
	public OOTestVO2(String name, String telNo) {
		this.name = name;
		this.telNo = telNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	@Override
	public String toString() {
		return name + " " + telNo;
	}
}
public class IO9TelBookTest {
	public static void main(String[] args) throws ClassNotFoundException {
		// 전화번호부 입력기를 만들자
		// ObjectOutputStream을 사용하여 파일의 전화번호부를 관리
		// 검색, 수정, 삭제 없음
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			File outFile = new File((new File(".").getCanonicalPath())+ "\\src\\tellBook.dat");
			fos = new FileOutputStream(outFile);
			oos = new ObjectOutputStream(fos);
			OOTestVO2 vo = new OOTestVO2(sc.next(), sc.next());
			oos.writeObject(vo);
			vo = new OOTestVO2(sc.next(), sc.next());
			oos.writeObject(vo);
		}
		catch(IOException e){
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}