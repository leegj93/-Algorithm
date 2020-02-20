import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class IO8Buffered {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			File inFile = new File((new File(".").getCanonicalPath())
					+"\\src\\filetest2.txt");
			File outFile = new File((new File(".").getCanonicalPath())
					+"\\src\\filetestcopy2.txt");
			fr= new FileReader(inFile);
			br = new BufferedReader(fr);
			pw = new PrintWriter(outFile);
			String str = null;
			while((str= br.readLine()) !=null) {
				System.out.println(str);
				pw.println(str);
			}
			pw.println("printWriter 사용");
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
