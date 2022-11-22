package test.ch08.interface_extends;

public class ExtendsEx {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = impl; //자동 형변환
		ia.methodA();
		
		InterfaceB ib = impl; //자동 형변환
		ib.methodB();
				
		interfaceC ic = impl; //자동 형변환
		//★interfaceC는 InterfaceA, InterfaceB를 상속을 받았으므로 아래와 같이 호출 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
