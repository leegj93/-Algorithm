/*
 * <pre>
 * 회원 정보와 기능을 구현한 class
 * </pre>
 * 
 * @author rojaiho
 * @version 5.1.2
 * @see String
 */
public class Movie2 {
	/** 제목 데이터를 저장하는 변수 */
	String title;
	/** 감독 데이터를 저장하는 변수 */
	String director;
	/** 장르 데이터를 저장하는 변수 */
	String genre;
	/** 줄거리 데이터를 저장하는 변수 */
	String summary;
	/** 등급 데이터를 저장하는 변수 */
	int grade;
	/** 객체가 가지고 있는 정보를 출력하는 메소드 */
	public void movieInfo() {
		System.out.println("제목 : "+title+"\t"
				+"감독 : "+title+"\t"
				+"장르 : "+title+"\t"
				+"등급 : "+title+"\t"
				+"줄거리 : "+title+"\t");
	}
	public String toString() {
		return "";
	}
}
