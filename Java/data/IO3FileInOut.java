import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO3FileInOut {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File file = new File((new File(".").getCanonicalPath())
														+"\\src\\filetest.txt");
			File outFile = new File((new File(".").getCanonicalPath())
														+"\\src\\filetestcopy.txt");
			fis = new FileInputStream(file);
			fos = new FileOutputStream(outFile);
			int i=0;
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
				fos.write(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
