package ch02.sec05;

public class BooleanEx {
    public static void main(String[] args) {
        //boolean 타입은 true, false 2가지의 값을 갖는다.
        boolean stop = true;
        boolean run = false;

        System.out.println("stop: " + stop + ", run: " + run);

        int x = 10;
        //부등식에서는 true 혹은 false로 항상 결과값이 나온다.
        boolean result1 = (x == 20); //x의 값이 20과 같나요? 아니요(false)
        boolean result2 = (x > 11); //x의 값이 11보다 큰가? 아니요(false)
        boolean result3 = (x != 20); //x의 값이 20과 같지 않나요? 네(true)

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);



    }
}
