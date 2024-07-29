package ch04.sec03;

public class SwitchCharEx {
    public static void main(String[] args) {
        char grade = 'a';

        //switch문에 괄호에 올수 있는 타입: 정수(byte, char, short, int, long), 문자열(String)
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수회원");
                break;
            case 'B':
            case 'b':
                System.out.println("일반회원");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}
