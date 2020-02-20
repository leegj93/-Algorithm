
public class Array9Directions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { {1,2,3}
						,{4,5,6}
						,{7,8,9}};
//		int[]pointY= {-1,1,0,0};
//		int[]pointX= {0,0,-1,1};
		String [] pointStr = {"상전 : ","상 : ", "상후 : "
								,"하전 : ", "하 : ","하후 : ", "좌 : ", "우 :"};
		int[]pointY= {-1,-1,-1,1,1,1,0,0};
		int[]pointX= {-1,0,1,-1,0,1,-1,1};
		System.out.println(arr[1+pointY[0]][1+pointX[0]]);
		System.out.println(arr[1+pointY[1]][1+pointX[1]]);
		System.out.println(arr[1+pointY[2]][1+pointX[2]]);
		System.out.println(arr[1+pointY[3]][1+pointX[3]]);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("현재 위치 : " +arr[i][j]);
				int y=0, x=0;
				for (int k = 0; k < pointX.length; k++) {
					y= i+pointY[k];
					x = j+pointX[k];
					if(y<0 || x< 0|| y>= arr.length || x>=arr.length)continue;
					System.out.println(pointStr[k]+arr[y][x] );
				}
			}
			
		}

	}

}
