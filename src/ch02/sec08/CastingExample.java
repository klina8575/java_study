package ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        //강제타입 변환(int -> byte)
        int var1 = 10;
        byte var2 = (byte) var1; //-128 ~ 127
        System.out.println("var2: " + var2);

        //강제타입 변환(long -> int)
        long var3 = 300;
        int var4 = (int) var3;
        System.out.println("var4: " + var4);

        //강제타입 변환(int -> char)
//        int var5 = 65;
        int var5 = 80000; //유니코드 허용범위 (0 ~ 65535)를 벗어나므로 값의 손실 발생
        char var6 = (char) var5; //정수값을 유니코드 'A'로 인식
        System.out.println("var6: " + var6);

        //강제타입 변환(실수 -> 정수)
        double var7 = 3.14;
        int var8 = (int) var7; //소수점 이하 제거
        System.out.println("var8: " + var8);


    }
}
