
public class MovieTest {

	public static void main(String[] args) {
		Movie movie =new Movie();	// new 생성자()
		movie.movieInfo();
		movie.title="맨인블랙";
		movie.movieInfo();
		
		Movie movie2 = new Movie();
		movie2 = movie;	// 12라인의 객체는 GC 대상이 됨 & movie를 참조하게 됨
		
		movie2.title = "기생충";
		movie.movieInfo();
		
	}

}
