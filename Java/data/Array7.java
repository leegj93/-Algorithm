
public class Array7 {

	public static void main(String[] args) {
		//구구단
		int [][] intArr= new int[8][9];
		
		for(int i=2, a=0; i<10; a++,i++) {
			for(int j=1,b=0; j<10; b++,j++) {
				intArr[a][b]= (i*j);
				System.out.println(i +"*"+j +"="+intArr[a][b]);
			}
			
		}
	}

}
