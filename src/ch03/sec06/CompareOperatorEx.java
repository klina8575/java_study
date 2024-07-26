package ch03.sec06;

public class CompareOperatorEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        // char타입의 비교연산
        char char1 = 'A'; //65
        char char2 = 'B'; //66
        //비교연산시 int로 타입변환이 일어난다.
        boolean result4 = (char1 < char2);
        System.out.println("result4: " + result4);

        //정수, 실수 비교연산
        int num3 = 1;
        double num4 = 1.0;
        // 비교연산시 정수보다 실수가 더 허용범위가 크므로 실수로 변환되어 연산
        boolean result5 = (num3 == num4);
        System.out.println("result5: " + result5);

        //★float, double 비교시 주의사항
        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        System.out.println("result6: " + result6);

        //해결책: 강제타입변환으로 타입을 float로 맞춰줘야 한다.
        boolean result7 = (num5 == (float) num6);
        System.out.println("result7: " + result7);

        //double로 타입을 맞출경우 생기는 문제(정밀도 문제)
        boolean result10 = ((double) num5 == num6); //false출력
        System.out.printf("num5를 double타입으로 바꿨을때: %.20f \n", (double)num5);
        System.out.printf("num6: %.20f \n", num6);


        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = str1.equals(str2);
        boolean result9 = !str1.equals(str2); //반대로

        System.out.println("result8: " + result8);
        System.out.println("result9: " + result9);







    }
}
