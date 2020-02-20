import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * InputStreamReader : 8bit입력 -> 16bit입력
 * OutputStreamWriter : 8bit출력 -> 16bit출력
 */
public class IO5ReadWriteFiler {

	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		try {
			File inFile = new File((new File(".").getCanonicalPath())
														+"\\src\\filetest2.txt");
			File outFile = new File((new File(".").getCanonicalPath())
														+"\\src\\filetestcopy2.txt");
			fis = new FileInputStream(inFile);
			isr = new InputStreamReader(fis);
			fos = new FileOutputStream(outFile);
			osw = new OutputStreamWriter(fos);
			int i=0;
			while((i=isr.read()) != -1) {
				System.out.print((char)i);
				osw.write(i);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close();//close는 생성의 역순으로...
				fis.close();
				osw.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
