package ch02.sec01;

public class VariableInitializationEx {
    public static void main(String[] args) {
        //1. 변수 선언과 동시에 값 대입(할당)
//        int age = 20; //age 변수에 20이 들어있다. age는 타입이 정수형 int이므로 정수 값만 담을 수 있다.
//        double score = 90; //score 변수에 90.22가 들어있다. score는 타입이 실수형 double이므로 실수 값만 담을 수 있다.(단 정수 90은 90.0)
//
//        System.out.println(age);
//        System.out.println(score);

        //2. 변수 선언 후 나중에 값 대입(할당)
        int age;
        double score;

        age = 20;
        score = 90.22;

        System.out.println("제 나이는 " + age + "살 입니다.");
        System.out.println("제 점수는 " + score + "점 입니다.");


        int x = 10;
        int y = x;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
