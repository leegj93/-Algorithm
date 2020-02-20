package first;

public class AccessCallSameFolder {
	public static void main(String[] args) {
		AccessModifierTest amt = new AccessModifierTest();
		System.out.println(amt.publicInt);
		System.out.println(amt.protectedInt);
		//System.out.println(amt.privateInt);// private는 class 밖에서 인식이 안됨
		
	}

}
