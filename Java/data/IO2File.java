import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO2File {

	public static void main(String[] args) {
		//File f = new File("C:\\SSAFY\\workspace\\01_javabasic\\src\\filetest.txt");
//		FileInputStream fis
//		= new FileInputStream("C:\\SSAFY\\workspace\\01_javabasic\\src\\filetest.txt");
		FileInputStream fis2 = null;
		try {
			File f1 = new File((new File(".").getCanonicalPath())+"\\src\\filetest.txt");
			fis2 = new FileInputStream(f1);
			int i=0;
			while((i=fis2.read()) != -1) {//-1:EndOfFile
				System.out.print((char)i);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();//Exception 정보 출력.
		} catch(IOException e) {
			e.printStackTrace();//Exception 정보 출력.
		} finally {
			try {
				fis2.close();
			} catch (IOException e) {
				e.printStackTrace();//Exception 정보 출력.
			}
		}
//		try(FileInputStream fis2 = new FileInputStream(f1)) {//java1.7 이상만 가능.
//		} catch(IOException e) {
//			
//		} finally {
//		}

	}//main

}



