import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReadTest {

	public static void main(String[] args) throws IOException {
//		InputStream in = Test.class.getResourceAsStream("aaa.txt");
//		BufferedReader br = new BufferedReader(new InputStreamReader(in));
//		String line = null;
//		while((line=br.readLine())!=null){
//			System.out.println(line);
//		}
		System.out.println(new File(".").getCanonicalPath());
		System.out.println((new File(".").getCanonicalPath())+"\\src\\aaa.txt");
//		FileInputStream fis = new FileInputStream((new File(".").getCanonicalPath())+"\\src\\aaa.txt");
//		int i=0;
//		while((i=fis.read())!=-1) {
//			System.out.print((char)i);
//		}
		FileReader fr = new FileReader((new File(".").getCanonicalPath())+"\\src\\aaa.txt");
		int i=0;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
	}

}
