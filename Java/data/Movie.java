/** + ctrl + enter */
/**
 * 이 클래스는 영화에 대한 정보를 담는다.
 * @author student
 */
public class Movie {
	// 멤버 변수
	/**
	 * 영화 제목을 의미한다.
	 */
	String title;
	String director;
	int grade;
	String genre;
	String summary;
	
	public Movie(String title, String director, int grade, String genre, String summary) {
		// this. : 자신의 멤버를 지정할 때
		/*this.title = title;//The assignment to variable title has no effect
		this.director = director;
		this.grade = grade;
		this.genre = genre;
		this.summary = summary;*/
		// this() --> 자신의 다른 생성자 호출
		this(title, director, grade, genre);//Constructor call must be the first statement in a constructor
		this.summary = summary;
	}
	
	public Movie(String title, String director, int grade, String genre) {
		// this. : 자신의 멤버를 지정할 때
		this(title, director, grade);
		this.genre = genre;
	}
	
	
	
	public Movie(String title, String director, int grade) {
		this.title = title;
		this.director = director;
		this.grade = grade;
	}

	public Movie() {}
	
	// 멤버 메서드
	/**
	 * 영화의 내용을 콘솔에 출력한다.
	 */
	public void movieInfo() {
		System.out.println(this.toString());
	}
	public String toString() {
		return title+" : "+director+" : "+grade+" : "+genre+" : "+summary;
	}
}
