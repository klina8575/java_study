package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //자동 타입변환(형변환)
		vehicle.run();
//		vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
}
