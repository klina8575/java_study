package ch03.sec08;

public class BitLogicalEx {
    public static void main(String[] args) {
        System.out.println(45 & 25);
        System.out.println(45 | 25);
        System.out.println(45 ^ 25);
        System.out.println(~45);
        System.out.println("-------------------------");

        byte receiveData = -120;

        //방법1: 비트 논리곱 연산으로 데이터(136) 복원
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        //방법2: 자바에서 제공하는 메소드로 데이터(136) 복원
        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);

    }
}
