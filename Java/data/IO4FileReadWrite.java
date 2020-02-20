import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO4FileReadWrite {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			File inFile = new File((new File(".").getCanonicalPath())
					+"\\src\\filetest2.txt");
			File outFile = new File((new File(".").getCanonicalPath())
					+"\\src\\filetestcopy2.txt");
			fr = new FileReader(inFile);
			fw = new FileWriter(outFile);
			int i=0;
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
				fw.write(i);
			}
			fw.write("와우~추워요...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}//main

}



