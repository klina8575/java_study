package ch03.sec02;

public class ArithOperatorEx {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2; //모든 피연산자는 int타입으로 자동 변환 후 연산
        System.out.println("result1: " + result1);
    }
}
