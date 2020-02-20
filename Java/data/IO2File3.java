import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class IO2File3 {
	ArrayList<File> list = new ArrayList<File>();
	public static void main(String[] args) {
		File f1 = new File("C:\\SSAFY_INS\\upload_workshop_java");
		//특정 폴더에 있는 모든 폴더와 모든 파일을 리스트하시오.
		//폴더가 있는 경우, 그 하위의 모든 폴더와 모든 파일도 리스트 하시오.
		IO2File3 io2 = new IO2File3();
		io2.addList(f1);
		for(int i=0; i<io2.list.size(); i++) {
			File f = io2.list.get(i);
//			io2.list.add(f);
			if(f.isDirectory()) {
				io2.addList(f);
				System.out.println(f);
			}
		}
		for(File f : io2.list) {
			System.out.println(f);
		}
	}//main
	public void addList(File dir) {
		File [] tmpArr = dir.listFiles();
		for(File tmp : tmpArr) {
			this.list.add(tmp);
		}
	}
}


