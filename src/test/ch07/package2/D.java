package test.ch07.package2;

import test.ch07.package1.A;

public class D extends A {
	//protected는 상속을 통해서만 사용할 수 있다.
	public D() {
		super(); //A클래스의 생성자 호출
	}
	
	public void method1() {
//		super.field = "1";
//		super.method();		
		this.field = "1";
		this.method();
	}
	
	public void method2() {
		//★protected 사용시 직접 객체를 생성해서 사용할수는 없다.
		A a = new A(); //x
		a.field = "1"; //x
		a.method(); //x
	}
}
