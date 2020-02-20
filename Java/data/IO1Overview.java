/**
 * IO: InputStream & OutputStream
 * - Stream : data의 이동을 의미
 * - Input : 외부에서 myProgram으로 data 이동
 * - Output : myProgram에서 외부로 data 이동
 * - Node(기반): data source와 destination을 연결하는 기능
 * - filter(조작) : data 가공 또는 용이한 접근을 제공
 * - byte(8bit) : 입출력 단위가 8bit. 비영어권 문자 표현에 제약이 있음
 * 				class name이 InputStream, OutputStream으로 끝남
 * - char(16bit) : 입출력 단위가 16bit 비영어권 문자 표현가능
 * - Stream의 조합시 주의사항 : Reader는 Reader끼리, InputStream은 InputStrema끼리
 * - 생성한 IO객체는 반드시 close()해야함
 * 	close()할때는 역순으로
 * @author multicampus
 *
 */
public class IO1Overview {
	public static void main(String[] args) {
		
	}
}
