package ch04.sec03;

public class SwitchExpressionEx {
    public static void main(String[] args) {
        char grade = 'b';

        switch (grade) {
            //중괄호 안에 실행문이 하나만 있을때는 중괄호 생략 가능
            case 'A','a' -> System.out.println("우수회원");
            case 'B','b' -> System.out.println("일반회원");
            default -> System.out.println("손님");
        }
    }
}
