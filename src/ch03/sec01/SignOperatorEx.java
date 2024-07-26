package ch03.sec01;

public class SignOperatorEx {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println("x: " + x);

        byte b = 100;
        int y = -b; //java에서는 부호를 변경시 연산(x -1)을 하므로 int로 자동타입 변환 발생
        System.out.println("y: " + y);
    }
}
