import java.io.FileNotFoundException;
import java.io.IOException;

//FileNotFoundException-▷IOException-▷Exception
class OESuper {
	public void name() throws IOException {}
	public IOException gogo() {return new IOException();}
}
class OEChild extends OESuper {
	//public void name() throws IOException {}//똑같은 경우 ok.
	//public void name() {}//throws 없애도 된다.
	public void name() throws FileNotFoundException {}
	//throws에 선언된 IOException의 상속에서의 하위class는 선언 ok.

	//public void name() throws Exception {}//error
	//throws에 선언된 IOException의 상속에서의 상위class를 선언할 수 없다.

	//public IOException gogo() {return new IOException();}//똑같은 경우 ok.
	public FileNotFoundException gogo() {return new FileNotFoundException();}
	//return type에 선언된 IOException의 상속에서의 하위class는 선언 ok.

	//public void gogo() {}//error//return type 바꿀 수 없음.
	//public Exception gogo() {return new IOException();}//error
	//return type에 선언된 IOException의 상속에서의 상위class를 선언할 수 없다.
}

public class Exception6Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
