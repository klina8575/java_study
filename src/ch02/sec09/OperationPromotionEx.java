package ch02.sec09;

public class OperationPromotionEx {
    public static void main(String[] args) {
        short v1 = 10;
        byte v2 = 20;

        int result2 = v1 + v2; //int타입으로 변환 후 연산됨 -> 담을 그릇(result2)을 int타입으로 바꿈
//        short result2 = (short)(v1 + v2); // -> 강제타입변환(데이터 손실 우려때문에 사용 지양)

        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result4 = v3 + v4 + v5; //피연산자 중에 long타입이 하나라도 있으면 long타입으로 변환 후 연산됨

        System.out.println("result4:" + result4);


        //실수, 실수
        float f1 = 1.2f;
        double d1 = 3.4;

        double result5 = f1 + d1; //double타입으로 변환 후 연산됨 -> 실수끼리의 연산도 허용범위가 큰 타입으로 변환
        System.out.println("result5:" + result5);

        //실수, 정수
        int v9 = 10;
        double doubleValue = 5.5;
        double result = v9 + doubleValue; //double 타입으로 변환 후 연산됨 -> 정수보다 실수의 허용범위가 더 큼
        System.out.println("result: " + result);

        int result6 = v9 + (int) doubleValue; //int타입으로 연산하고 싶으면 강제타입 변환 -> 정수보다 실수의 허용범위가 더 큼
        System.out.println("result6: " + result6);

        //자바에서는 실수 리터럴을 double타입으로 인식하므로 4.0은 double타입
        double result7 = v9 / 4.0; //double 타입(실수)으로 변환 후 연산됨
        float result8 = v9 / 4.0f; //float 타입(실수)으로 변환 후 연산됨
        System.out.println("result7: " + result7);

        //char 연산
        char v6 = 'A'; //65
        char v7 = 1;
        int result9 = v6 + v7; //66
        System.out.println("result9: " + result9);
        System.out.println("result9: " + (char) result9);

        //생각해볼 문제
        int x = 1;
        int y = 2;
        //정수 연산의 결과는 항상 정수다 -> 결과값인 0.5에서 소수점을 버린다 -> 0
        double result10 = x / y; //0을 double 타입 변수에 저장하므로 0.0이 출력된다.
        System.out.println("result10: " + result10);

        //0.5를 얻기 위한 방법 세가지
        double result11 =  (double) x / y;
        System.out.println("result11: " + result11);

        double result12 =  x / (double) y;
        System.out.println("result12: " + result12);

        double result13 =  (double) x / (double) y;
        System.out.println("result13: " + result13);

        //주의
        //(x / y)를 먼저 계산함 -> 0을 double 타입으로 바꿔 결과를 대입해줌
        double result14 = (double) (x / y);
        System.out.println("result14: " + result14);


    }
}
