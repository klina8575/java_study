package ch03.sec05;

public class InfinityAndNaNEx {
    public static void main(String[] args) {
       // int result = 5 / 0; //무한대의 값의 정수로 표현할 수 없기때문에 나중에 Exception처리를 따로 해줘야 한다.
        //System.out.println(result);

        int x = 5;
        double y = 0.0;
        double z = x / y;
        double t = x % y;

        System.out.println(z + 2);
        System.out.println(t + 2);

        //infinity와 NaN이 나올 경우에 대처하는 방법

        //무한대인가? 무한대면 true 그렇지 않으면 false
        if(Double.isInfinite(z)) {
            System.out.println(Double.isInfinite(z));
            System.out.println("무한대, 값 산출 불가");
        }

        //NaN인가? NaN이면 true 그렇지 않으면 false
        if(Double.isNaN(t)) {
            System.out.println(Double.isNaN(t));
            System.out.println("Not a Number, 값 산출 불가");
        }


    }
}
