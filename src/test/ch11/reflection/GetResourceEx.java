package test.ch11.reflection;

public class GetResourceEx {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("logo.gif").getPath();
		String photo2Path = clazz.getResource("images/logo.gif").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
		
		
		
				
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
