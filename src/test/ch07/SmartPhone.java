package test.ch07;

//자식클래스
public class SmartPhone extends phone {
	//필드
	public boolean wifi;
	
	//생성자
	public SmartPhone(String model, String color) {
		this.model = model; //부모필드에 접근 가능
		this.color = color; //부모 필드에 초기값을 준다.
	}
	
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");		
	}
}
