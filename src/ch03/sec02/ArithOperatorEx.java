package ch03.sec02;

public class ArithOperatorEx {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2; //모든 피연산자는 int타입으로 자동 변환 후 연산
        System.out.println("result1: " + result1);

        long result2 = v1 + v3 - v4; //모든 피연산자는 long타입으로 자동 변환 후 연산
        System.out.println("result2: " + result2);

        double result3 = (double) v1 / v2; //정수끼리의 연산결과는 정수이기 때문에 double타입으로 강제 형변환
        System.out.println("result3: " + result3);

        int result4 = v1 % v2; //나머지 구함, 모든 피연산자는 int타입으로 자동 변환 후 연산
        System.out.println("result4: " + result4);
    }
}
