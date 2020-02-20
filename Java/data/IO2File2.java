import java.io.File;

public class IO2File2 {

	public static void main(String[] args) {
		File f1 = new File("C:\\SSAFY");
		System.out.println("canRead : "+f1.canRead());
		System.out.println("canWrite : "+f1.canWrite());
		System.out.println("canExecute : "+f1.canExecute());
		System.out.println("isDirectory : "+f1.isDirectory());
		System.out.println("isFile : "+f1.isFile());
		System.out.println("getAbsolutePath : "+f1.getAbsolutePath());
		System.out.println("getParent : "+f1.getParent());
		System.out.println("getPath : "+f1.getPath());
		System.out.println("getName : "+f1.getName());
		String [] ssaffyDir = f1.list();
//		for(String tmp : ssaffyDir) {
//			System.out.println(tmp);
//		}
		File [] ssaffyDir2 = f1.listFiles();
		for(File f : ssaffyDir2) {
			System.out.println(f);
		}
	}//main

}






