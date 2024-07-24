package ch02.sec07;

public class PromotionEx {
    public static void main(String[] args) {
        //1. 정수끼리 자동타입 변환
        byte byteValue = 10;
        short shortValue2 = byteValue; //자동타입 변환
        int intValue = byteValue; //자동타입 변환 -> byte타입이었던 10은 int타입으로 저장된다.
        System.out.println("intValue: " + intValue);

        intValue = 50; //int
        long longValue = intValue; //자동타입 변환 -> int타입이었던 50은 long타입으로 저장

        short shortValue = 10;
        int intValue2 = shortValue; //자동타입 변환 -> short타입이었던 10은 int타입으로 저장


        //2. 정수보다 실수의 허용범위가 더 큼 -> 정수에서 실수로 자동타입변환이 일어난다.
        long longValue2 = 100;
        float floatValue = longValue2; //자동타입 변환 발생
        double doubleValue = longValue2; //자동타입 변환 발생

        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);

        //3. 실수끼리의 자동타입 변환
        float floatValue2 = 100.5F;
        double doubleValue2 = floatValue2; //자동타입변환

        System.out.println("doubleValue2: " + doubleValue2);

        //4. char -> int 타입 변환
        char charValue = 'A'; //65
        int intValue3 = charValue; //자동타입변환
        System.out.println("intValue3: " + intValue3);

        long longValue3 = charValue; //자동타입변환
        System.out.println("longValue3: " + longValue3);

//        short shortValue3 = charValue;  //자동타입변환  X
//        char charValue2 = shortValue2; //자동타입변환 X
        /*
        * short의 값의 허용 범위: -32,768 ~ 32,767
        * char 값의 허용 범위: 0 ~ 65,536
        * 첫번째 이유, 값의 허용 범위가 서로 달라서 데이터의 손실이 올 수 있음
        * 두번째 이유, 음수부호 문제
        * */






    }
}
