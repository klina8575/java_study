package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {

//        int num = 1000000000000000000; //0이 18개, int의 허용범위를 넘어섬

//        long var3 = 1000000000000000000; //에러 발생, 자바에서는 int타입으로 정수를 인식한다.

//        자바에서는 long 타입의 숫자 뒤에 반드시 L을 붙여줘야 한다(대문자, 소문자 모두 가능)
//        long var4 = 1000000000000000000L;
        long var4 = 1000000000000000000l;

        long var1 = 10; //int타입으로 인식
        long var2 = 20L; //long 타입으로 인식

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
